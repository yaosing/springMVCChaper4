package com.chapter7;

import java.util.Date;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.chapter4.model.Product;

public class ProductValidator implements Validator {

	public boolean supports(Class<?> klass) {
		return Product.class.isAssignableFrom(klass);
	}

	public void validate(Object target, Errors errors) {
		Product product = (Product) target;
		ValidationUtils.rejectIfEmpty(errors, "name", "productname.required");
		ValidationUtils.rejectIfEmpty(errors, "price", "productprice.required");
		ValidationUtils.rejectIfEmpty(errors, "date", "productiondate.required");
		
		Float price = product.getPrice();
		if (price != null && price < 0) {
			errors.rejectValue("price", "price.nagative");
		}
		
		Date date = product.getDate();
		if(date != null){
			if(date.after(new Date())){
				System.out.println("validation");
				errors.rejectValue("date", "productionDate.invalid");
			}
		}
	}

}
