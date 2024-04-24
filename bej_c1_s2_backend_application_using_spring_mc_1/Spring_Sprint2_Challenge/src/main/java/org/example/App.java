package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MovieConfig.class);

        Movie mov1 = context.getBean("Movie1",Movie.class);
        System.out.println("Movie 1 data ="+mov1);

        Movie mov2 = context.getBean("Movie2",Movie.class);
        System.out.println("Movie 2 data ="+mov2);

        Movie mov3 = context.getBean("Movie3",Movie.class);
        System.out.println("Movie 3 data ="+mov3);
    }
}