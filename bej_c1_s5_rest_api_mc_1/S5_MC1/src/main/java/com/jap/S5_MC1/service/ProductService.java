package com.jap.S5_MC1.service;
import com.jap.S5_MC1.domain.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
}
