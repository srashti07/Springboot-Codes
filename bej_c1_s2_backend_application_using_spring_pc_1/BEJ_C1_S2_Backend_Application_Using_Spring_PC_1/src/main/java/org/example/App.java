package org.example;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] str) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ProductConfig.class);
        Product pro1 = context.getBean("Product1", Product.class);
        System.out.println("Product 1 ="+pro1);

        Product pro2= context.getBean("Product2", Product.class);
        System.out.println("Product 2 ="+pro2);
    }
}