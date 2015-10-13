package com.chapter6.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<Date> {
	private String datePattern;
	private SimpleDateFormat dateFormat;
	
	public DateFormatter(String datePattern)
	{
		this.datePattern = datePattern;
		dateFormat = new SimpleDateFormat(datePattern);
		dateFormat.setLenient(false);
	}
	public String print(Date date, Locale locale) {
		return dateFormat.format(date);
	}

	public Date parse(String s, Locale locale) throws ParseException {
		try {
			System.out.println("In DateFormatter");
			return dateFormat.parse(s);
		} catch (Exception e) {
			throw new 
			IllegalArgumentException("Invalid date format. Please use this pattern:"
					+datePattern);
		}
	}

}
