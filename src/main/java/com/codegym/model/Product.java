package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private float price;
    private int quantity;
    private String color;
    private int category_id;

    public Product() {
    }

    public Product(String name, float price, int quantity, String color, int category_id) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.category_id = category_id;
    }

    public Product(int id, String name, float price, int quantity, String color, int category_id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.category_id = category_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
