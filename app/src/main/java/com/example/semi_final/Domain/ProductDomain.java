package com.example.semi_final.Domain;

public class ProductDomain {

    public ProductDomain(String title, String description, String picUrl, int numberinCart, double price) {
        this.title = title;
        this.description = description;
        this.picUrl = picUrl;
        this.numberinCart = numberinCart;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getNumberinCart() {
        return numberinCart;
    }

    public void setNumberinCart(int numberinCart) {
        this.numberinCart = numberinCart;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String title;
    private String description;
    private String picUrl;
    private int numberinCart;
    private double price;


}
