package com.topsquad.ninzy.movieservice.controller;

import com.topsquad.ninzy.movieservice.service.abstracts.MovieService;
import com.topsquad.ninzy.movieservice.entity.Movie;
import com.topsquad.ninzy.movieservice.entity.dto.MovieRequestDto;
import com.topsquad.ninzy.movieservice.entity.dto.MovieResponseDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie/movies/")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("displayingMovies")
    public List<MovieResponseDto> getAllDisplayingMoviesInVision() {
        return movieService.getAllDisplayingMoviesInVision();
    }

    @GetMapping("comingSoonMovies")
    public List<MovieResponseDto> getAllComingSoonMovies() {
        return movieService.getAllComingSoonMovies();
    }

    @GetMapping("{movieId}")
    public MovieResponseDto getMovieById(@PathVariable int movieId) {
        return movieService.getMovieByMovieId(movieId);
    }

    @PostMapping("add")
    @CircuitBreaker(name="movie", fallbackMethod = "fallback")
    @Retry(name="movie")
    public Movie addMovie(@RequestBody MovieRequestDto movieRequestDto) {
        return movieService.addMovie(movieRequestDto);
    }

    private Movie fallback(MovieRequestDto movieRequestDto, RuntimeException runtimeException) throws RuntimeException {
        return null;
    }

}