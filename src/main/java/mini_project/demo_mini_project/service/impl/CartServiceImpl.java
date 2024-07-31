package mini_project.demo_mini_project.service.impl;

import mini_project.demo_mini_project.model.entity.Cart;
import mini_project.demo_mini_project.repository.impl.CartReposityImpl;
import mini_project.demo_mini_project.service.CartService;

import java.util.List;

public class CartServiceImpl implements CartService {
    @Override
    public boolean checkProductInCart(Integer proId) {
        return new CartReposityImpl().checkProductInCart(proId);
    }

    @Override
    public boolean update(Integer proId) {
        return new CartReposityImpl().update(proId);
    }

    @Override
    public boolean save(Integer proId) {
        return new CartReposityImpl().save(proId);
    }

    @Override
    public List<Cart> findAll() {
        return new CartReposityImpl().findAll();
    }
}
