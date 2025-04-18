package com.resturant.resturant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.resturant.resturant.entites.Product;
import com.resturant.resturant.repoistry.ProductRepository;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(String name, Double price, String description, 
                             String category, MultipartFile image, String lang) throws IOException {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);
        product.setCategory(category);
        product.setImage(image.getBytes());
        product.setLang(lang);
        
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public List<Product> getProductsByCategoryAndLang(String category, String lang) {
        return productRepository.findByCategoryAndLang(category, lang);
    }

    public List<Product> getProductsByLang(String lang) {
        return productRepository.findByLang(lang);
    }
}