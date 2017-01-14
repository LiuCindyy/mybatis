package com.liufangning.demo.mybatis0113.inter;
import java.util.List;

import com.liufangning.demo.mybatis0113.User;

public interface IUserOperation {
	public User getUserByID(int id);
	public List<User> selectUsers(String userName);
	public void addUser(User user);
}
