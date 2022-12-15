package com.geekbrains.project.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.geekbrains.project.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
    Page<Product> findAllBy(Pageable pageable);
}
