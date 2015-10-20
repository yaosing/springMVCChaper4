package com.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Retention ע��ָ��Annotation�����೤ʱ�� RetentionPolicy.CLASS:Annotations are to be
 *            recorded in the class file by the compiler but need not be
 *            retained by the VM at run time. This is the default behavior.
 * 
 *            RetentionPolicy.RUNTIME��Annotations are to be recorded in the
 *            class file by the compiler and retained by the VM at run time, so
 *            they may be read reflectively.
 * 
 *            RetentionPolicy.SOURCE��Annotations are to be discarded by the
 *            compiler
 * @Target ע��ָ��Annotation����������Щ����Ԫ�أ�@Target����һ����Ϊvalue
 * �ĳ�Ա�������ñ����Ǹ�������ΪElementType[]��ElementTypeΪö������
 * ֵ�����¼�����
 * 
	* ElementType.TYPE���������ࡢ�ӿڻ�ö������

	* ElementType.FIELD�������γ�Ա����

	* ElementType.METHOD�������η���

	* ElementType.PARAMETER�������β���

	* ElementType.CONSTRUCTOR�������ι�����

	* ElementType.LOCAL_VARIABLE�������ξֲ�����

	* ElementType.ANNOTATION_TYPE��������ע��

	* ElementType.PACKAGE�������ΰ�

�������ע��MyTagʱ��ʹ����@Documented���ζ��壬
������javadoc��������API�ĵ���
����ʹ��ע��A���εĳ���Ԫ�أ��������ע��A��˵����
@Inherited ָ��Annotation ���м̳���
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
