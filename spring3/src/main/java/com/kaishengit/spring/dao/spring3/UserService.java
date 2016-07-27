package com.kaishengit.spring.dao.spring3;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.inject.Named;



public class UserService {
	private userDao userDao;
	public void setUserDao(userDao userDao) {
		this.userDao = userDao;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setStrList(List<String> strList) {
		this.strList = strList;
	}

	public void setSetSet(Set<String> setSet) {
		this.setSet = setSet;
	}


	private String name;
	private int age;
	private List<String> strList;

	private Set<String> setSet;


	public void save() {
		userDao.save();
	}

	
}
