package mini_project.demo_mini_project.model.entity;

public class Cart {
    private Integer cartId;
    private Integer proId;
    private Integer quantity;

    public Cart() {
    }

    public Cart(Integer cartId, Integer proId, Integer quantity) {
        this.cartId = cartId;
        this.proId = proId;
        this.quantity = quantity;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
