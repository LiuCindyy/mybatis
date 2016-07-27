package com.kaishengit.spring.dao.spring3;

import javax.inject.Named;

import org.springframework.stereotype.Repository;

@Named
public class UserDaoOracle implements userDao{

	public void init() {
		System.out.println("Oracle inited");
		
	}

	public void save() {
		System.out.println("Oracle Saved");
		
	}

	public void destroy() {
		System.out.println("Oracle destroyed");
	}

	public void myInit() {
		// TODO Auto-generated method stub
		
	}

	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
