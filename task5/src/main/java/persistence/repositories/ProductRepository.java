package persistence.repositories;

import persistence.entities.Product;
import java.util.List;

public interface ProductRepository {

    List<Product> findAll();

    List<Product> findAllSortedByName();

    Product findById(Long id);

    void deleteById(Long id);

    void saveOrUpdate(Product product);
}