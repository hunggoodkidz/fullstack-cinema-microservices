package com.topsquad.ninzy.movieservice.repository;


import com.topsquad.ninzy.movieservice.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category getCategoryByCategoryId(int categoryId);
}
