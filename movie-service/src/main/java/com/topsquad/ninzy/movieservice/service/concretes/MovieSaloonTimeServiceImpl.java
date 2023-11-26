package com.topsquad.ninzy.movieservice.service.concretes;

import com.topsquad.ninzy.movieservice.service.abstracts.MovieSaloonTimeService;
import com.topsquad.ninzy.movieservice.repository.MovieSaloonTimeRepository;
import com.topsquad.ninzy.movieservice.entity.MovieSaloonTime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieSaloonTimeServiceImpl implements MovieSaloonTimeService {

    private final MovieSaloonTimeRepository movieSaloonTimeRepository;

    @Override
    public List<MovieSaloonTime> getMovieSaloonTimeSaloonAndMovieId(int saloonId, int movieId) {
        return movieSaloonTimeRepository.getMovieSaloonTimeBySaloonSaloonIdAndMovieMovieId(saloonId, movieId);
    }
}
