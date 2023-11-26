package com.topsquad.ninzy.movieservice.service.abstracts;


import com.topsquad.ninzy.movieservice.entity.MovieImage;
import com.topsquad.ninzy.movieservice.entity.dto.ImageRequestDto;

public interface MovieImageService {

    MovieImage addMovieImage(ImageRequestDto imageRequestDto);
}
