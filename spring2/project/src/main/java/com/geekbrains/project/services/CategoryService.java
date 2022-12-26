package com.geekbrains.project.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.geekbrains.project.models.Category;
import com.geekbrains.project.models.Product;
import com.geekbrains.project.repositories.CategoryRepository;
import com.geekbrains.project.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    public Optional<Category> findByTitle(String title) {
        return categoryRepository.findByTitle(title);
    }
}
