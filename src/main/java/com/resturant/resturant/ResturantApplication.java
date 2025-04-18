package com.resturant.resturant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.resturant.resturant.services.ProductService;

@SpringBootApplication
public class ResturantApplication  {

   

    public static void main(String[] args) {
        SpringApplication.run(ResturantApplication.class, args);
    }

   
}
