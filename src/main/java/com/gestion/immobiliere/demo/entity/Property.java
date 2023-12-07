package com.gestion.immobiliere.demo.entity;

public class Property {

    private long id;
    private String address;
    private double price;

    public Property() {
        // Constructeur par défaut
        this.id = 0; // ou une valeur par défaut appropriée
        this.address = "";
        this.price = 0.0; // ou une valeur par défaut appropriée
    }

    public Property(long id, String address, double price) {
        this.id = id;
        this.address = address;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

