package com.topsquad.ninzy.movieservice.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieResponseDto implements Serializable {

    private int movieId;
    private String movieName;
    private String description;
    private int duration;
    private Date releaseDate;
    private boolean isDisplay;

    private int categoryId;
    private String categoryName;

    private String movieImageUrl;
    private String movieTrailerUrl;

    private String directorName;

//    private List<Actor> actors;

}
