package com.topsquad.ninzy.movieservice.service.concretes;

import com.topsquad.ninzy.movieservice.service.abstracts.CategoryService;
import com.topsquad.ninzy.movieservice.service.abstracts.DirectorService;
import com.topsquad.ninzy.movieservice.service.abstracts.MovieService;
import com.topsquad.ninzy.movieservice.repository.MovieRepository;
import com.topsquad.ninzy.movieservice.entity.Category;
import com.topsquad.ninzy.movieservice.entity.Director;
import com.topsquad.ninzy.movieservice.entity.Movie;
import com.topsquad.ninzy.movieservice.entity.dto.MovieRequestDto;
import com.topsquad.ninzy.movieservice.entity.dto.MovieResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final CategoryService categoryService;
    private final DirectorService directorService;
    private final WebClient.Builder webClientBuilder;

    @Cacheable(value = "displaying_movies")
    @Override
    public List<MovieResponseDto> getAllDisplayingMoviesInVision() {
        return movieRepository.getAllDisplayingMoviesInVision();
    }

    @Cacheable(value = "comingSoon_movies")
    @Override
    public List<MovieResponseDto> getAllComingSoonMovies() {
        return movieRepository.getAllComingSoonMovies();
    }

    @Override
    public MovieResponseDto getMovieByMovieId(int movieId) {
        return movieRepository.getMovieById(movieId);
    }

    @Override
    public Movie getMovieById(int movieId) {
        return movieRepository.getMovieByMovieId(movieId);
    }

    @CacheEvict(value = "comingSoonMovie", allEntries = true)
    @Override
    public Movie addMovie(MovieRequestDto movieRequestDto) {

        Boolean result = webClientBuilder.build().get()
                .uri("http://USERSERVICE/api/user/users/isUserAdmin")
                .header("Authorization", "Bearer " + movieRequestDto.getUserAccessToken())
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

        if (result) {
            Category category = categoryService.getCategoryById(movieRequestDto.getCategoryId());
            Director director = directorService.getDirectorById(movieRequestDto.getDirectorId());

            Movie movie = Movie.builder()
                    .movieName(movieRequestDto.getMovieName())
                    .description(movieRequestDto.getDescription())
                    .duration(movieRequestDto.getDuration())
                    .releaseDate(movieRequestDto.getReleaseDate())
                    .movieTrailerUrl(movieRequestDto.getTrailerUrl())
                    .category(category)
                    .director(director)
                    .isDisplay(movieRequestDto.isInVision())
                    .build();
            return movieRepository.save(movie);
        }

        throw new RuntimeException("Yetki hatası");
    }
}
