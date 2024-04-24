package com.jap.S6_PC1.controller;

import com.jap.S6_PC1.domain.Product;
import com.jap.S6_PC1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/product-data")
@RestController
public class ProductController
{

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService)
    {
        this.productService=productService;
    }

    @PostMapping("/add")
    public ResponseEntity<Product> insertProduct(@RequestBody Product product)
    {
        return new ResponseEntity<Product>(this.productService.addproduct(product), HttpStatus.CREATED);

    }
    @GetMapping("/product")
    public ResponseEntity<?> getAllProduct(){

        return new ResponseEntity<>(productService.getAllProduct( ),HttpStatus.FOUND);
    }
    @GetMapping("/product/{productName}")
    public ResponseEntity<?>getProductByProductName(@PathVariable String productName){
        return new ResponseEntity<>(productService.getProductByProductName(productName),HttpStatus.FOUND);
    }
    @DeleteMapping("/product/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable int productId){
        return new ResponseEntity<>(productService.deleteProductByProductId(productId),HttpStatus.OK);
    }


}
