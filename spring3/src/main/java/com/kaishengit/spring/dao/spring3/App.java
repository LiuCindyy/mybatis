package com.kaishengit.spring.dao.spring3;

import java.security.Provider.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kaishengit.aop.UserDao;
import com.kaishengit.entity.User;

public class App {
	public static void main (String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = new User();
		user.setUsername("fsdf");
		user.setPassword("13423");
		UserDao userDao = (UserDao)ctx.getBean("userDao");
		userDao.save(user);
		
	}
}

 