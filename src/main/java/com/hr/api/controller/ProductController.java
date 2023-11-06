package com.hr.api.controller;

import com.hr.api.domain.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private List<Product> products = new ArrayList<>();

    /**
     * Gets all products
     *
     * @return list of products
     */
    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    /**
     * Gets the product for the given id
     *
     * @param id product identifier
     * @return the product details
     */
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null; // Handle not found case
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                return product;
            }
        }
        return null; // Handle not found case
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        products.removeIf(product -> product.getId() == id);
    }
}
