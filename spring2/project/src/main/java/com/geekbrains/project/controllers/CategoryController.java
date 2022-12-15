package com.geekbrains.project.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.geekbrains.project.error_handling.MarketError;
import com.geekbrains.project.error_handling.ResourceNotFoundException;
import com.geekbrains.project.models.Category;
import com.geekbrains.project.models.Product;
import com.geekbrains.project.services.CategoryService;
import com.geekbrains.project.services.ProductService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/{id}")
    public Category getOneCategoryById(@PathVariable Long id) {
        return categoryService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Models.Category doesn't exists: " + id));
    }
}
