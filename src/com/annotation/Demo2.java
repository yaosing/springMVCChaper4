package com.annotation;

import java.lang.reflect.Method;

public class Demo2 {
	public static void process(String clazz) {
		Class<?> targetClass = null;

		try {
			targetClass = Class.forName(clazz);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		for (Method m : targetClass.getMethods()) {
			if (m.isAnnotationPresent(MyTag.class)) {
				MyTag tag = m.getAnnotation(MyTag.class);
				System.out.println("方法" + m.getName() + "的MyTag注解内容为:"
						+ tag.name() + "," + tag.age());
			}
		}
	}

	public static void m1() {
	}
	//default name is terry, default age is 24
	@MyTag
	public static void m2() {
	}

	@MyTag(name = "tomato")
	public static void m3() {
	}

	@MyTag(name = "tomato", age = 30)
	public static void m4() {
	}
	
	public static void main(String[] args) {
		process("com.annotation.Demo2");
	}
}
