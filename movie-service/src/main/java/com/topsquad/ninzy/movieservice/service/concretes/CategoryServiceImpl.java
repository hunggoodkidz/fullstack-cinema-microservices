package com.topsquad.ninzy.movieservice.service.concretes;

import com.topsquad.ninzy.movieservice.service.abstracts.CategoryService;
import com.topsquad.ninzy.movieservice.repository.CategoryRepository;
import com.topsquad.ninzy.movieservice.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Cacheable(value = "categories")
    @Override
    public List<Category> getall() {

        return categoryRepository.findAll(Sort.by(Sort.Direction.ASC, "categoryName"));
    }

    @Override
    public Category getCategoryById(int categoryId) {
        return categoryRepository.getCategoryByCategoryId(categoryId);
    }
}
