//package com.resturant.resturant;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**") // كل المسارات
//                .allowedOrigins("*") // كل origins مسموح بيها
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // لازم OPTIONS!
//                .allowedHeaders("*") // كل الهيدرز
//                .allowCredentials(true); // لو فيه Authorization أو Cookies
//    }
//}
