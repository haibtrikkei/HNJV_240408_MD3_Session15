package mini_project.demo_mini_project.repository;

import mini_project.demo_mini_project.model.entity.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();
}
