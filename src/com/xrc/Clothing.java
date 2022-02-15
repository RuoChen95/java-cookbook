package com.xrc;

public class Clothing {
    String description;
    double price;
    double tax;
    String size = "M";

    private final double MIN_PRICE = 10.0;
    private final double MIN_TAX = 0.2;


    // Exercise 5-1 Apply Encapsulation
    public double getPrice() {
        return price * (1 + tax);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }
}
