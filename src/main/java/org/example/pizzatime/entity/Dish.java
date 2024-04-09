package org.example.pizzatime.entity;

public class Dish {
    private Long id;
    private String dishName;
    private String description;
    private Integer numberOfGrams;
    private Integer price;

    public Dish(Long id, String dishName, String description, Integer numberOfGrams, Integer price) {
        this.id = id;
        this.dishName = dishName;
        this.description = description;
        this.numberOfGrams = numberOfGrams;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfGrams() {
        return numberOfGrams;
    }

    public void setNumberOfGrams(Integer numberOfGrams) {
        this.numberOfGrams = numberOfGrams;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", dishName='" + dishName + '\'' +
                ", description='" + description + '\'' +
                ", numberOfGrams=" + numberOfGrams +
                ", price=" + price +
                '}';
    }
}