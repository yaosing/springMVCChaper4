package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbcTemplate{
	
	@Test
	public void testConnection(){
		ApplicationContext context = new ClassPathXmlApplicationContext("file:WebContent/WEB-INF/config/testJdbcTemplate.xml");	
		System.out.println(context.getBean("jdbcTemplate"));
	}
 }
