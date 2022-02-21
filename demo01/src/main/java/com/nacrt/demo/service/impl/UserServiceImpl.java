package com.nacrt.demo.service.impl;

import com.nacrt.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Override
	public void sayHello() {
		System.out.println("hello world!!!");
	}
}
