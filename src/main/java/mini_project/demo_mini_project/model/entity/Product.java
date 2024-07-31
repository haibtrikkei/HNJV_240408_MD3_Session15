package mini_project.demo_mini_project.model.entity;

public class Product {
    private Integer proId;
    private String proName;
    private String shortDescription;
    private String description;
    private String imageName;
    private Double price;
    private Integer cateId;

    public Product() {}

    public Product(Integer proId, String proName, String shortDescription, String description, String imageName, Double price, Integer cateId) {
        this.proId = proId;
        this.proName = proName;
        this.shortDescription = shortDescription;
        this.description = description;
        this.imageName = imageName;
        this.price = price;
        this.cateId = cateId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }
}
