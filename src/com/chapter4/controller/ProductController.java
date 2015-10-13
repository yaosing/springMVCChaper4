package com.chapter4.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chapter4.model.Product;
import com.chapter4.service.ProductService;

@Controller
public class ProductController {
	private static final Log logger = LogFactory
			.getLog(ProductController.class);

	@RequestMapping(value = "/product_input")
	public String inputProduct() {
		logger.info("input product called");
		return "productForm";
	}
/*
	@RequestMapping(value = "product_save")
	public String saveProduct(ProductForm productForm, Model model) {
		
		logger.info("saveProduct called");

		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		product.setPrice(Float.parseFloat(productForm.getPrice()));

		model.addAttribute("product", product);
		return "productDetail";
	}
	*/

	/*
	 * --------------------------------------------------------------------------
	 * ----------------
	 */

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "product_save", method = RequestMethod.POST)
	public String saveProductNew(Product product,
			RedirectAttributes redirectAttributes) {
		logger.info("new saveProduct called");
		logger.info(product.toString());
//		Product product = new Product();
//		product.setName(productForm.getName());
//		product.setDescription(productForm.getDescription());
//		product.setPrice(Float.parseFloat(productForm.getPrice()));
		
		Product savedProduct = productService.add(product);
			
		redirectAttributes.addFlashAttribute("message", "add success");
		return "redirect:/product_view/" + savedProduct.getId();
	}
	
	@RequestMapping(value="product_view/{id}")
	public String viewProduct(@PathVariable Long id, Model model){
		Product product = productService.get(id);
		model.addAttribute("product", product);
		return "productDetail";
	}
}
