package com.nacrt.demo.xml;

public class UserServiceImpl implements UserService {
	@Override
	public void say() {
		System.out.println("hello .....");
	}

	@Override
	public void init() {
		System.out.println("init ...");
	}
}
