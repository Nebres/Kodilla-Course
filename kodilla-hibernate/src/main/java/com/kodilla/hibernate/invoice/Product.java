package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public Product(String name) {
        this.name = name;
    }

    public Product(){}

    @Id
    @GeneratedValue
    @NotNull
    @Column(name= "ID", unique = true)
    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "PRODUCT_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId() == product.getId() &&
                Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

}