package com.topsquad.ninzy.movieservice.service.concretes;

import com.topsquad.ninzy.movieservice.service.abstracts.CityService;
import com.topsquad.ninzy.movieservice.service.abstracts.MovieService;
import com.topsquad.ninzy.movieservice.repository.CityRepository;
import com.topsquad.ninzy.movieservice.entity.City;
import com.topsquad.ninzy.movieservice.entity.Movie;
import com.topsquad.ninzy.movieservice.entity.dto.CityRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final MovieService movieService;
    private final WebClient.Builder webClientBuilder;


    @Override
    public List<City> getCitiesByMovieId(int movieId) {
        return cityRepository.getCitiesByMovieMovieId(movieId);
    }

    @Cacheable(value = "cities")
    @Override
    public List<City> getall() {
        return cityRepository.findAll(Sort.by(Sort.Direction.ASC, "cityName"));
    }

    @CacheEvict(value = "cities", allEntries = true)
    @Override
    public void add(CityRequestDto cityRequestDto) {
        Boolean result = webClientBuilder.build().get()
                .uri("http://USERSERVICE/api/user/isUserAdmin")
                .header("Authorization", "Bearer " + cityRequestDto.getToken())
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();
        if (result) {
            Movie movie = movieService.getMovieById(cityRequestDto.getMovieId());
            for (String cityName: cityRequestDto.getCityNameList()) {
                City city = City.builder()
                        .cityName(cityName)
                        .movie(movie)
                        .build();
                cityRepository.save(city);
            }
        }
    }
}
