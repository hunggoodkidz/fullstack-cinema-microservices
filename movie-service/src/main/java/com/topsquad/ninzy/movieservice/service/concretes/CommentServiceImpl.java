package com.topsquad.ninzy.movieservice.service.concretes;

import com.topsquad.ninzy.movieservice.service.abstracts.CommentService;
import com.topsquad.ninzy.movieservice.service.abstracts.MovieService;
import com.topsquad.ninzy.movieservice.repository.CommentRepository;
import com.topsquad.ninzy.movieservice.entity.Comment;
import com.topsquad.ninzy.movieservice.entity.Movie;
import com.topsquad.ninzy.movieservice.entity.dto.CommentRequestDto;
import com.topsquad.ninzy.movieservice.entity.dto.DeleteCommentRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final MovieService movieService;
    private final WebClient.Builder webClientBuilder;

    @Override
    public List<Comment> getCommentsByMovieId(int movieId, int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
        return commentRepository.getCommentsByMovieMovieId(movieId, pageable);
    }

    @Override
    public int getNumberOfCommentsByMovieId(int movieId) {
        return commentRepository.countCommentByMovieMovieId(movieId);
    }

    @Override
    public void deleteComment(DeleteCommentRequestDto deleteCommentRequestDto) {

        Boolean result = webClientBuilder.build().get()
                .uri("http://USERSERVICE/api/user/users/isUserCustomer")
                .header("Authorization","Bearer " + deleteCommentRequestDto.getToken())
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

        if (result) {
            commentRepository.deleteById(deleteCommentRequestDto.getCommentId());
        }

    }

    @Override
    public Comment addComment(CommentRequestDto commentRequestDto) {

        Boolean result = webClientBuilder.build().get()
                .uri("http://USERSERVICE/api/user/users/isUserCustomer")
                .header("Authorization","Bearer " + commentRequestDto.getToken())
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

        if (result) {
            Movie movie = movieService.getMovieById(commentRequestDto.getMovieId());

            Comment comment = Comment.builder()
                    .commentByUserId(commentRequestDto.getCommentByUserId())
                    .commentBy(commentRequestDto.getCommentBy())
                    .commentText(commentRequestDto.getCommentText())
                    .movie(movie)
                    .build();

            return commentRepository.save(comment);
        }
        throw new RuntimeException("Yetki hatası");
    }
}
