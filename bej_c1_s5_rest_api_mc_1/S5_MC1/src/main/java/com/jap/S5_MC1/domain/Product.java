package com.jap.S5_MC1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    String productName;
    @Id
    int productId;
    String manufacture;

    public Product(String productName, int productId, String manufacture) {
        this.productName = productName;
        this.productId = productId;
        this.manufacture = manufacture;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
