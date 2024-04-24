package com.jap.S6_PC1.service;

import com.jap.S6_PC1.domain.Product;
import com.jap.S6_PC1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements  ProductService
{

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository)
    {
        this.productRepository = productRepository;

    }
    @Override
    public Product addproduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public List<Product> getProductByProductName(String productName) {
        return productRepository.findByProductName(productName);
    }
    @Override
    public boolean deleteProductByProductId(int productId){
        productRepository.deleteById(productId);
        return true;
    }
}
