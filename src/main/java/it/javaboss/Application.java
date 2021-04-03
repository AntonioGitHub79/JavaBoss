package it.javaboss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Spring Boot main Application
 *
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer
{
    public static void main( String[] args ) throws Exception {
    	
    	System.out.println("test");
        SpringApplication.run(Application.class, args);
    }
}
