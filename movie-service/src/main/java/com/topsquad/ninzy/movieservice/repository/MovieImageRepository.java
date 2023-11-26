package com.topsquad.ninzy.movieservice.repository;

import com.topsquad.ninzy.movieservice.entity.MovieImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieImageRepository extends JpaRepository<MovieImage, Integer> {
}
