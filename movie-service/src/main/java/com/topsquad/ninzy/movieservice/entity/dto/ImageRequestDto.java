package com.topsquad.ninzy.movieservice.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageRequestDto {

    private int movieId;
    private String imageUrl;
    private String token;
}
