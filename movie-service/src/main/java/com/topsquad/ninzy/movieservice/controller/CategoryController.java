package com.topsquad.ninzy.movieservice.controller;

import com.topsquad.ninzy.movieservice.service.abstracts.CategoryService;
import com.topsquad.ninzy.movieservice.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movie/categories/")
@RequiredArgsConstructor
//@CrossOrigin
public class CategoryController {

    private final CategoryService categoryService;


    @GetMapping("getall")
    public List<Category> getall() {
       return categoryService.getall();
    }
}
