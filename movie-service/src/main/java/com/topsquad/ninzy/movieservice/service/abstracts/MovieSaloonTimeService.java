package com.topsquad.ninzy.movieservice.service.abstracts;

import com.topsquad.ninzy.movieservice.entity.MovieSaloonTime;

import java.util.List;

public interface MovieSaloonTimeService {

    List<MovieSaloonTime> getMovieSaloonTimeSaloonAndMovieId(int saloonId, int movieId);
}
