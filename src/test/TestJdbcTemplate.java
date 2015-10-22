package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class TestJdbcTemplate {

	private static ApplicationContext context;
	private static JdbcTemplate jdbcTemplate;
	private static NamedParameterJdbcTemplate namedJdbcTemplate;

	@Test
	public void init() {
		context = new ClassPathXmlApplicationContext(
				"file:WebContent/WEB-INF/config/testJdbcTemplate.xml");
		jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		namedJdbcTemplate = (NamedParameterJdbcTemplate) context
				.getBean("namedParameterjdbcTemplate");
	}
	/*
	 * namedJdbcTemplate.queryForObject
	 */
	@Test
	public void getBookCount(){
		String sql = "select count(0) from books where  author = :author";
		SqlParameterSource source = new MapSqlParameterSource("author", "book0");
		System.out.println(namedJdbcTemplate.queryForObject(sql, source, Integer.class));
	}
}
