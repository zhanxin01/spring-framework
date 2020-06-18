package org.springframework.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringText {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");

		Object user = classPathXmlApplicationContext.getBean("user");


		System.out.println(user);

	}
}
