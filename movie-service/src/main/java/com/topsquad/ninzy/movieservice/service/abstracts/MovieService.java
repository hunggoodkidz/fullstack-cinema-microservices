package com.topsquad.ninzy.movieservice.service.abstracts;



import com.topsquad.ninzy.movieservice.entity.Movie;
import com.topsquad.ninzy.movieservice.entity.dto.MovieRequestDto;
import com.topsquad.ninzy.movieservice.entity.dto.MovieResponseDto;

import java.util.List;

public interface MovieService {

    List<MovieResponseDto> getAllDisplayingMoviesInVision();

    List<MovieResponseDto> getAllComingSoonMovies();

    MovieResponseDto getMovieByMovieId(int movieId);

    Movie getMovieById(int movieId);

    Movie addMovie(MovieRequestDto movieRequestDto);
}
