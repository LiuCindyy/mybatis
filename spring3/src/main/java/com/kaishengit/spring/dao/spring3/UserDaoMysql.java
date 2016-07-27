package com.kaishengit.spring.dao.spring3;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Named
public class UserDaoMysql implements userDao{

	@Autowired
	public void init() {
		System.out.println("Mysql inited");
		
	}

	public void save() {
		System.out.println("Mysql saved");
		
	}
	
	

	public void destroy() {
		System.out.println("Mysql destroyed");
		
	}

	public void myInit() {
		// TODO Auto-generated method stub
		System.out.println("Mysql inited");
	}

	public int count() {
		if(true) {
			throw new RuntimeException("数据库查询错误");
		}
		return 101;
	}

}
