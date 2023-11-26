package com.topsquad.ninzy.movieservice.service.abstracts;

import com.topsquad.ninzy.movieservice.entity.Comment;
import com.topsquad.ninzy.movieservice.entity.dto.CommentRequestDto;
import com.topsquad.ninzy.movieservice.entity.dto.DeleteCommentRequestDto;

import java.util.List;

public interface CommentService {

    List<Comment> getCommentsByMovieId(int movieId, int pageNo, int pageSize);

    void deleteComment(DeleteCommentRequestDto deleteCommentRequestDto);

    Comment addComment(CommentRequestDto commentRequestDto);

    int getNumberOfCommentsByMovieId(int movieId);
}
