package com.galaxy.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.galaxy.spring.model.Product;

@RestController()
@RequestMapping(path = Constants.URL_ROOT)
public class SpringBootRestController {

	@RequestMapping(path = Constants.URL_APPNAME, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String sayHello() {
		return "Welcome to SimpleSpringBootWebAppApplication";
	}
	
	@RequestMapping(path = Constants.URL_PRODUCT, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Product> getProduct() {
		List <Product> productList = new ArrayList<Product>();
		
		Product product = new Product(1, "Product 1", 100.00);
		productList.add(product);
		product = new Product(2, "Product 2", 100.00);
		productList.add(product);
		return productList; 
	}
}
