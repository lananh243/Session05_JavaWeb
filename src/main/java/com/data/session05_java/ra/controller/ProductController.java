package com.data.session05_java.ra.controller;

import com.data.session05_java.ra.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products;

    public ProductController() {
        products = new ArrayList<>();
        // Sample data
        products.add(new Product(1, "Sản phẩm A", 10.99, "Mô tả sản phẩm A"));
        products.add(new Product(2, "Sản phẩm B", 15.49, "Mô tả sản phẩm B"));
    }

    public List<Product> getProducts() {
        return products;
    }
}
