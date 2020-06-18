package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.service.*.*(..))")
	public void berfoMethod(){
		System.out.println("berfoMethod执行了。。。");
	}

	/*@After("execution(com.service.*.*(..))")
	public void afterMethod(){
		System.out.println("afterMethod。。。");
	}*/




}
