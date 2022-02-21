package com.nacrt.demo;

import com.nacrt.demo.config.AppConfig;
import com.nacrt.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService bean = ac.getBean(UserService.class);
		bean.sayHello();
		System.out.println(bean);
	}
}
