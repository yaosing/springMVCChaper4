package com.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Retention 注解指定Annotation保留多长时间 RetentionPolicy.CLASS:Annotations are to be
 *            recorded in the class file by the compiler but need not be
 *            retained by the VM at run time. This is the default behavior.
 * 
 *            RetentionPolicy.RUNTIME：Annotations are to be recorded in the
 *            class file by the compiler and retained by the VM at run time, so
 *            they may be read reflectively.
 * 
 *            RetentionPolicy.SOURCE：Annotations are to be discarded by the
 *            compiler
 * @Target 注解指定Annotation用于修饰哪些程序元素，@Target包含一个名为value
 * 的成员变量，该变来那个的类型为ElementType[]，ElementType为枚举类型
 * 值有如下几个：
 * 
	* ElementType.TYPE：能修饰类、接口或枚举类型

	* ElementType.FIELD：能修饰成员变量

	* ElementType.METHOD：能修饰方法

	* ElementType.PARAMETER：能修饰参数

	* ElementType.CONSTRUCTOR：能修饰构造器

	* ElementType.LOCAL_VARIABLE：能修饰局部变量

	* ElementType.ANNOTATION_TYPE：能修饰注解

	* ElementType.PACKAGE：能修饰包

如果定义注解MyTag时，使用了@Documented修饰定义，
则在用javadoc命令生成API文档后，
所有使用注解A修饰的程序元素，将会包含注解A的说明。
@Inherited 指定Annotation 具有继承性
 * @author YAOSING
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Inherited
public @interface MyTag {
	String name() default "terry";
	int age() default 24;
}
