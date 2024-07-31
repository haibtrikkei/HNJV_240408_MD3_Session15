package mini_project.demo_mini_project.repository;


import mini_project.demo_mini_project.model.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    List<Product> findLimit8();
    Product findById(Integer proId);
    boolean save(Product product);
}
