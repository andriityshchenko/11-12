package com.ua.sportnutrition.domain;

import java.math.BigDecimal;

public class Supplement {

    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private Integer weightGrams;
    private String imageUrl;
    private String description;
    private String category;
    private String flavor;

    public Supplement() {
    }

    public Supplement(Long id, String name, String brand, BigDecimal price,
                      Integer weightGrams, String imageUrl, String description,
                      String category, String flavor) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.weightGrams = weightGrams;
        this.imageUrl = imageUrl;
        this.description = description;
        this.category = category;
        this.flavor = flavor;
    }

    // --- Getters ---

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getWeightGrams() {
        return weightGrams;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getFlavor() {
        return flavor;
    }

    // --- Setters ---

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setWeightGrams(Integer weightGrams) {
        this.weightGrams = weightGrams;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
