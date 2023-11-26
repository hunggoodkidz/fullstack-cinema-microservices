package com.topsquad.ninzy.movieservice.service.concretes;

import com.topsquad.ninzy.movieservice.service.abstracts.MovieImageService;
import com.topsquad.ninzy.movieservice.service.abstracts.MovieService;
import com.topsquad.ninzy.movieservice.repository.MovieImageRepository;
import com.topsquad.ninzy.movieservice.entity.Movie;
import com.topsquad.ninzy.movieservice.entity.MovieImage;
import com.topsquad.ninzy.movieservice.entity.dto.ImageRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
@RequiredArgsConstructor
public class MovieImageServiceImpl implements MovieImageService {

    private final MovieImageRepository movieImageRepository;
    private final MovieService movieService;
    private final WebClient.Builder webClientBuilder;


    @Override
    public MovieImage addMovieImage(ImageRequestDto imageRequestDto) {

        Boolean result = webClientBuilder.build().get()
                .uri("http://USERSERVICE/api/user/isUserAdmin")
                .header("Authorization", "Bearer " + imageRequestDto.getToken())
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

        if (result) {
            Movie movie = movieService.getMovieById(imageRequestDto.getMovieId());

            MovieImage image = new MovieImage();
            image.setImageUrl(image.getImageUrl());
            image.setMovie(movie);

            return movieImageRepository.save(image);
        }
        throw new RuntimeException("Yetki hatası");
    }
}
