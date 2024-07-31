package mini_project.demo_mini_project.service;

import mini_project.demo_mini_project.model.entity.Cart;

import java.util.List;

public interface CartService {
    boolean checkProductInCart(Integer proId);
    boolean update(Integer proId);
    boolean save(Integer proId);
    List<Cart> findAll();
}
