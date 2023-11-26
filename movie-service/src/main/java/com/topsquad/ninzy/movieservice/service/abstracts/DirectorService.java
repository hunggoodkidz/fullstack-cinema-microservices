package com.topsquad.ninzy.movieservice.service.abstracts;


import com.topsquad.ninzy.movieservice.entity.Director;
import com.topsquad.ninzy.movieservice.entity.dto.DirectorRequestDto;

import java.util.List;

public interface DirectorService {

    List<Director> getall();

    Director getDirectorById(int directorId);

    Director add(DirectorRequestDto directorRequestDto);
}
