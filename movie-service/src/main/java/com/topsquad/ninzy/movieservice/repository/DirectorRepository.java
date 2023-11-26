package com.topsquad.ninzy.movieservice.repository;


import com.topsquad.ninzy.movieservice.entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Integer> {

    Director getDirectorByDirectorId(int directorId);
}
