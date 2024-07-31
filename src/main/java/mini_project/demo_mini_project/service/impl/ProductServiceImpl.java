package mini_project.demo_mini_project.service.impl;

import mini_project.demo_mini_project.model.entity.Product;
import mini_project.demo_mini_project.repository.impl.ProductRepositoryImpl;
import mini_project.demo_mini_project.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> findAll() {
        return new ProductRepositoryImpl().findAll();
    }

    @Override
    public Product findById(Integer proId) {
        return new ProductRepositoryImpl().findById(proId);
    }

    @Override
    public boolean save(Product product) {
        return new ProductRepositoryImpl().save(product);
    }

    @Override
    public List<Product> findLimit8() {
        return new ProductRepositoryImpl().findLimit8();
    }
}
