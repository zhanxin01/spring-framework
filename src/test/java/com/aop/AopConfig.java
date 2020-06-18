package com.aop;

import com.entity.Order;
import com.service.Impl.OrderSerImpl;
import com.service.Impl.UserSerImpl;
import com.service.OrderSer;
import com.service.UserSer;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

	@Bean
	public MyAspect myAspect(){
		return new MyAspect();
	}

	@Bean
	public UserSer userSer(){
		return new UserSerImpl();
	}

	@Bean
	public OrderSer orderSer(){
		return new OrderSerImpl();
	}
}
