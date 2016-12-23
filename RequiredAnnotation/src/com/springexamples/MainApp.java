package com.springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Student student = (Student) context.getBean("student");

		System.out.println("Student name: " + student.getName());
		System.out.println("Student age: " + student.getAge());

	}
}
