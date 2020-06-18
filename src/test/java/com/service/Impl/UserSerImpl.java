package com.service.Impl;

import com.entity.User;
import com.service.UserSer;
import org.springframework.stereotype.Service;

@Service
public class UserSerImpl implements UserSer {

	@Override
	public User creatUser(User user) {
		System.out.println("UserSerImpl+creatUser");
		return user;
	}

	@Override
	public User getId(String id) {
		System.out.println("UserSerImpl+getId");
		User user = new User();
		user.setName("李四");
		user.setId("123");
		user.setAge(12);
		return user;
	}
}
