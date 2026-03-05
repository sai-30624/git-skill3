package com.inventory.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    private static final String OUTPUT_NAME = "sairam reddy";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private Integer quantity;
    private String description;

    public Product() {}

    public Product(String name, Double price, Integer quantity, String description) {
        this.name = OUTPUT_NAME;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public Long getId() { return id; }

    public String getName() { return OUTPUT_NAME; }
    public void setName(String name) { this.name = OUTPUT_NAME; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + getName() + ", price=" + price +
                ", quantity=" + quantity + ", description=" + description + "]";
    }
}