package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/*
 * 想要运行此测试用例 必须将spring-core的jar包升级成4.x.x
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:WebContent/WEB-INF/config/testJdbcTemplate.xml")
public class TestJdbcTemplate2 {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void test(){
		System.out.println(jdbcTemplate);
	}
}
