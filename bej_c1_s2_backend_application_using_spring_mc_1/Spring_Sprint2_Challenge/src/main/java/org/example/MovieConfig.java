package org.example;
import org.springframework.context.annotation.Bean;
public class MovieConfig {
    @Bean("Movie1")
    public Movie getMovieData(){
        return new Movie(1,"Our Interpreter","Zhang Tong",9);
    }
    @Bean("Movie2")
    public Movie getMovieData2(){
        return new Movie(2,"Doctor Slump","Paek Sun-woo", 8.8F);
    }
    @Bean("Movie3")
    public Movie getMovieData3(){
        return new Movie(3,"Animal","Sandeep Reddy Vanga",7.5F);
    }
}