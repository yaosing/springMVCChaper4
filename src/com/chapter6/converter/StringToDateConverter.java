package com.chapter6.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date> {
	private String datePattern;

	public StringToDateConverter() {
	}

	public StringToDateConverter(String pattern) {
		datePattern = pattern;
		System.out.println("instantiating .... converter with pattern: *"
				+ pattern);
	}

	public Date convert(String source) {
		try {
			System.out.println("In StringToDateConverter");
			SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
			dateFormat.setLenient(false);
			return dateFormat.parse(source);
		} catch (ParseException e) {
			throw new 
				IllegalArgumentException("Invalid date format. Please use this pattern:"
						+datePattern);
		}
	}

}
