package mini_project.demo_mini_project.service;

import mini_project.demo_mini_project.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(Integer proId);
    boolean save(Product product);
    List<Product> findLimit8();
}
