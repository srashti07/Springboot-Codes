package com.jap.S5_MC1.controller;

import com.jap.S5_MC1.domain.Product;
import com.jap.S5_MC1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping("/product")
    public ResponseEntity saveUser(@RequestBody Product product){
        Product savedProduct = productService.saveProduct(product);
        return new ResponseEntity(savedProduct, HttpStatus.CREATED);
    }
    @GetMapping("/product")
    public ResponseEntity getAllProducts(){
        List<Product> listOfProducts = productService.getAllProducts();
        return new ResponseEntity(listOfProducts,HttpStatus.OK);
    }
}
