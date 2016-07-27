package com.kaishengit.aop;

import java.sql.ResultSet;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.expression.common.TemplateAwareExpressionParser;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kaishengit.entity.User;

@Named
public class UserDao {
	
	@Inject
	JdbcTemplate jdb;
	public void save(User user) {
		String sql = "insert into login  VALUES ('?', '?')";
		System.out.println("Successful saved");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		jdb.update(sql, user.getUsername(),user.getPassword());
		
	}
}
