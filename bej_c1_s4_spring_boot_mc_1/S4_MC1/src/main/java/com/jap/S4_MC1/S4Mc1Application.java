package com.jap.S4_MC1;

import com.jap.S4_MC1.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class S4Mc1Application {
	private static MessageService messageService;

	public static void main(String[] args) {
		System.out.println("Hello World");
		ApplicationContext context = SpringApplication.run(S4Mc1Application.class, args);
		messageService = context.getBean("messageService",MessageService.class);
		String message = messageService.goodDay();


	}

}
