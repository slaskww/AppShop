package com.example.appshop.dto;


import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

public class ProductDto {

    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String category;
    @NotEmpty
    private String group;
    @NotEmpty
    private BigDecimal price;
    @NotEmpty
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
