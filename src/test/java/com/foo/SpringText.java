package com.foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringText {

	public static void main(String[] args) {
		System.out.println("=============================");
		ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");

		Object user = classPathXmlApplicationContext.getBean("user");


		//System.out.println(user);



	}

}
