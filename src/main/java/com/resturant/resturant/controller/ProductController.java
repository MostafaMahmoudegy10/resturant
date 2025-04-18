package com.resturant.resturant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.resturant.resturant.services.*;
import com.resturant.resturant.entites.Product;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> addProduct(
            @RequestParam("name") String name,
            @RequestParam("price") Double price,
            @RequestParam("description") String description,
            @RequestParam("category") String category,
            @RequestParam("image") MultipartFile image,
            @RequestParam("lang") String lang) throws IOException {
        
        Product product = productService.addProduct(name, price, description, category, image, lang);
        return ResponseEntity.ok(product);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable String category) {
        List<Product> products = productService.getProductsByCategory(category);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/lang/{lang}")
    public ResponseEntity<List<Product>> getProductsByLang(@PathVariable String lang) {
        List<Product> products = productService.getProductsByLang(lang);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/category/{category}/lang/{lang}")
    public ResponseEntity<List<Product>> getProductsByCategoryAndLang(
            @PathVariable String category,
            @PathVariable String lang) {
        
        List<Product> products = productService.getProductsByCategoryAndLang(category, lang);
        return ResponseEntity.ok(products);
    }
}