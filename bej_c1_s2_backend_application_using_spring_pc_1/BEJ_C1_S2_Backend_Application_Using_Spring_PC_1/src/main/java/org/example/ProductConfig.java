package org.example;

import org.springframework.context.annotation.Bean;




public class ProductConfig {
    @Bean("Product1")
    public Product getProductData(){
        return new Product(1,"Dinasour","These are multi color dinasours");
    }
    @Bean("Product2")
    public Product getProductData2(){
        return new Product(2,"Pikachu","This is a yellow colored pikachu plushie");
    }

}
