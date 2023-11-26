package com.topsquad.ninzy.movieservice.controller;

import com.topsquad.ninzy.movieservice.service.abstracts.ActorService;
import com.topsquad.ninzy.movieservice.entity.Actor;
import com.topsquad.ninzy.movieservice.entity.dto.ActorRequestDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie/actors/")
@RequiredArgsConstructor
public class ActorController {

    private final ActorService actorService;

    @GetMapping("getActorsByMovieId/{movieId}")
    public List<Actor> getActorsByMovieId(@PathVariable int movieId) {
       return actorService.getActorsByMovieId(movieId);
    }

    @GetMapping("getall")
    public List<Actor> getall() {
       return actorService.getall();
    }

    @PostMapping("add")
    @CircuitBreaker(name="actor", fallbackMethod="fallback")
    @Retry(name="actor")
    public void add(@RequestBody ActorRequestDto actorRequestDto) {
        actorService.addActors(actorRequestDto);
    }

    private void fallback(ActorRequestDto actorRequestDto, RuntimeException runtimeException) { }

}
