package com.jap.S5_MC1.repository;

import com.jap.S5_MC1.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
