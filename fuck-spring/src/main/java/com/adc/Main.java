package com.adc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloService helloService = context.getBean(HelloService.class);
		System.out.println(helloService.toString());
		helloService.hello("adc");
	}
}
