package com.liufangning.demo.mybatis0113;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.liufangning.demo.mybatis0113.User;
import com.liufangning.demo.mybatis0113.inter.IUserOperation;

public class Test {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlSessionFactory;
	}

//	public static void main(String[] args) {
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//			User user = (User) session
//					.selectOne(
//							"com.liufangning.demo.mybatis0113.UserMapper.selectUserByID",
//							1);
//			System.out.println(user.getUserAddress());
//			System.out.println(user.getUserName());
//		} finally {
//			session.close();
//		}
//	}//使用非接口的方法調用數據庫
	
//	public static void main(String args[]) {
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//			IUserOperation userOperation=session.getMapper(IUserOperation.class);
//			User user= userOperation.getUserByID(1);
//			 System.out.println(user.getUserAddress());
//	         System.out.println(user.getUserName());
//		}finally {
//			session.close();
//		}
//	}//使用接口的方法調用數據庫
	

public void getUserList(String userName){
        SqlSession session = sqlSessionFactory.openSession();
        try {
            IUserOperation userOperation=session.getMapper(IUserOperation.class);          
            List<User> users = userOperation.selectUsers(userName);
            for(User user:users){
                System.out.println(user.getId()+":"+user.getUserName()+":"+user.getUserAddress());
            }
           
        } finally {
            session.close();
        }
    }
public static void main(String[] args) {
    Test testUser=new Test();
    testUser.getUserList("%");
}
}