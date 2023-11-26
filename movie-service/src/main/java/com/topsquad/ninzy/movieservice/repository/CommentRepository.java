package com.topsquad.ninzy.movieservice.repository;


import com.topsquad.ninzy.movieservice.entity.Comment;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> getCommentsByMovieMovieId(int movieId, Pageable pageable);

    int countCommentByMovieMovieId(int movieId);
}
