package com.aop;

import com.service.UserSer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		UserSer userSer = (UserSer) context.getBean("userSer");
		userSer.getId("123");
	}
}
