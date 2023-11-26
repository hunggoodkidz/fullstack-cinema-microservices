package com.topsquad.ninzy.movieservice.service.abstracts;

import com.topsquad.ninzy.movieservice.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getall();

    Category getCategoryById(int categoryId);
}
