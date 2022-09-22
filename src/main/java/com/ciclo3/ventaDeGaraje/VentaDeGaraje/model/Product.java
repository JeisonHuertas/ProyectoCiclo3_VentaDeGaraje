package com.ciclo3.ventaDeGaraje.VentaDeGaraje.model;

import java.util.Date;

public class Product {

    private Integer id;
    private String productName;
    private Double price;
    private Date date;
    private Integer stock;
    private String image;
    private String description;
    private User user;

    public Product() {
    }

    public Product(Integer id, String productName, Double price, Date date, Integer stock, String image, String description, User user) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.date = date;
        this.stock = stock;
        this.image = image;
        this.description = description;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", stock=" + stock +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
