package mini_project.demo_mini_project.service.impl;

import mini_project.demo_mini_project.model.entity.Category;
import mini_project.demo_mini_project.repository.impl.CategoryRepositoryImpl;
import mini_project.demo_mini_project.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<Category> findAll() {
        return new CategoryRepositoryImpl().findAll();
    }
}
