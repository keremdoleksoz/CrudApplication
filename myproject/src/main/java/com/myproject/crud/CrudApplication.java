package com.myproject.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product1 = new Product((long) 1, "Cikolata", 5.85);
		Product product2 = new Product((long) 2, "Kurabiye", 8.5);
		productService.saveProduct(product1);
		productService.deleteProduct((long) 1);
		productService.updateProduct((long) 12, product2);
		productService.getAllProducts();
	}
}
