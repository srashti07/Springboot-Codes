package com.jap.S6_PC1.service;

import com.jap.S6_PC1.domain.Product;
import java.util.List;

public interface ProductService
{

    public Product addproduct(Product product);
    List<Product> getAllProduct();
    List<Product> getProductByProductName(String productName);
    boolean deleteProductByProductId(int productId);
}