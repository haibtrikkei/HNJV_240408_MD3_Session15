package mini_project.demo_mini_project.model.entity;

public class Category {
    private Integer cateId;
    private String cateName;
    private Boolean status;

    public Category() {
    }

    public Category(Integer cateId, String cateName, Boolean status) {
        this.cateId = cateId;
        this.cateName = cateName;
        this.status = status;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
