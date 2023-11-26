package com.topsquad.ninzy.movieservice.service.abstracts;



import com.topsquad.ninzy.movieservice.entity.City;
import com.topsquad.ninzy.movieservice.entity.dto.CityRequestDto;

import java.util.List;

public interface CityService {

    List<City> getCitiesByMovieId(int movieId);

    List<City> getall();

    void add(CityRequestDto cityRequestDto);
}
