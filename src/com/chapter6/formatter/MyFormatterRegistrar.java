package com.chapter6.formatter;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

public class MyFormatterRegistrar implements FormatterRegistrar {
	private String datePattern;

	public MyFormatterRegistrar(String pattern) {
		this.datePattern = pattern;
	}

	public void registerFormatters(FormatterRegistry registry) {
		System.out.println("in my formatter registrar ");
		registry.addFormatter(new DateFormatter(datePattern));
		// register more formatter
	}

}
