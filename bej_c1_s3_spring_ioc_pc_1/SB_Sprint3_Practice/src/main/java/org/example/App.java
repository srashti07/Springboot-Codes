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
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = ctx.getBean("employee",Employee.class);
        System.out.println();
        System.out.println();
        System.out.println(employee);

    }
}