package mini_project.demo_mini_project.model.dto;

import mini_project.demo_mini_project.model.entity.Product;

public class ProductDTO extends Product {
    private String cateName;

    public ProductDTO() {
    }

    public ProductDTO(Integer proId, String proName, String shortDescription, String description, String imageName, Double price, Integer cateId, String cateName) {
        super(proId, proName, shortDescription, description, imageName, price, cateId);
        this.cateName = cateName;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }
}
