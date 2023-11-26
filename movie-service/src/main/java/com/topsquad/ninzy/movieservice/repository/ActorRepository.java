package com.topsquad.ninzy.movieservice.repository;


import com.topsquad.ninzy.movieservice.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {

    List<Actor> getActorsByMovieMovieId(int movieId);
}
