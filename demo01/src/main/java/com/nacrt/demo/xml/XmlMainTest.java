package com.nacrt.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Properties;

public class XmlMainTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = ac.getBean(UserService.class);
		userService.say();
		System.out.println(userService);

		System.out.println("==================");
		Map<String, String> getenv = System.getenv();
		System.out.println(getenv);
		Properties properties = System.getProperties();
		System.out.println(properties);

		System.out.println("==================");
		MyFactoryBean myFactoryBean = ac.getBean(MyFactoryBean.class);
		System.out.println(myFactoryBean);
		System.out.println(myFactoryBean.getObject());
		System.out.println(myFactoryBean.getObject());
		System.out.println("-----");
		System.out.println(ac.getBean(A.class));
		System.out.println(ac.getBean("myFactoryBean"));
		System.out.println(ac.getBean("myFactoryBean"));


	}
}
