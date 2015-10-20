package com.annotation;

import java.lang.reflect.Method;

public class Demo1 {
	public static void process(String clazz) {
		Class<?> targetClass = null;

		try {
			targetClass = Class.forName(clazz);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		for (Method m : targetClass.getMethods()) {
			if(m.isAnnotationPresent(MyTag.class)){
				System.out.println("被mytag注释修饰的方法名:"+ m.getName());
			}else{
				System.out.println("没被mytag注释修饰的方法名:"+ m.getName());
			}
		}
	}
	
	public static void m1(){}
	
	@MyTag
	public static void m2(){}
	
	public static void main(String[] args){
		process("com.annotation.Demo1");
	}
}
