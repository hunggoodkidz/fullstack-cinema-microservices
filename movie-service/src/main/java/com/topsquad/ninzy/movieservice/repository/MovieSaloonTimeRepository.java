package com.topsquad.ninzy.movieservice.repository;

import com.topsquad.ninzy.movieservice.entity.MovieSaloonTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieSaloonTimeRepository extends JpaRepository<MovieSaloonTime, Integer> {

    List<MovieSaloonTime> getMovieSaloonTimeBySaloonSaloonIdAndMovieMovieId(int saloonId, int movieId);

}
