package com.topsquad.ninzy.movieservice.controller;


import com.topsquad.ninzy.movieservice.service.abstracts.DirectorService;
import com.topsquad.ninzy.movieservice.entity.Director;
import com.topsquad.ninzy.movieservice.entity.dto.DirectorRequestDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie/directors/")
@RequiredArgsConstructor
public class DirectorController {

    private final DirectorService directorService;


    @GetMapping("getall")
    public List<Director> getall() {
       return directorService.getall();
    }

    @PostMapping("add")
    @CircuitBreaker(name="director", fallbackMethod = "fallback")
    @Retry(name="director")
    public Director add(@RequestBody DirectorRequestDto directorRequestDto) {
        return directorService.add(directorRequestDto);
    }

    private Director fallback(DirectorRequestDto directorRequestDto, RuntimeException runtimeException)  throws RuntimeException{
        return null;
    }

}
