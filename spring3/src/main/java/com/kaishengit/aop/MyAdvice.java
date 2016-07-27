package com.kaishengit.aop;

public class MyAdvice {
	
	public void beforeAdvice() {
		System.out.println("前置通知");
	}
	
	public void afterReturningAdvice(Object result) {
		System.out.println("后置通知"+result);
	}
	
	
	public void afterThrowingAdvice() {
		System.out.println("异常通知");
	}

}
