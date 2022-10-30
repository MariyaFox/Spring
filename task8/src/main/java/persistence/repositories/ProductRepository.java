package persistence.repositories;

import persistence.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findProductByName(String name);
    List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
    List<Product> findProductByPriceLessThan(BigDecimal maxPrice);
    List<Product> findProductByPriceGreaterThan(BigDecimal minPrice);

    Page<Product> findProductsByPriceBetweenAndNameLike(BigDecimal minPrice, BigDecimal maxPrice, String partName, Pageable varPageSort);
}