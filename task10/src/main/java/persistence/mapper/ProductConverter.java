package persistence.mapper;

import org.springframework.stereotype.Component;
import persistence.dtos.ProductDto;
import persistence.entities.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductConverter {

    public ProductDto fromProduct(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setTitle(product.getTitle());
        productDto.setPrice(product.getPrice());
        return productDto;
    }

    public Product toProduct(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setTitle(productDto.getTitle());
        product.setPrice(productDto.getPrice());
        return product;
    }

}