package com.spring_framework.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		/*
		 * ApplicationContext is Superset of Bean Factory so every thing provided by
		 * Bean Factory is already present in ApplicationContext
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");

		Vehicle obj = (Vehicle) context.getBean("vehicle");
		obj.drive();
	}
}
