package com.topsquad.ninzy.movieservice.service.abstracts;

import com.topsquad.ninzy.movieservice.entity.Actor;
import com.topsquad.ninzy.movieservice.entity.dto.ActorRequestDto;

import java.util.List;

public interface ActorService {

    List<Actor> getActorsByMovieId(int movieId);

    List<Actor> getall();

    void addActors(ActorRequestDto actorRequestDto);
}
