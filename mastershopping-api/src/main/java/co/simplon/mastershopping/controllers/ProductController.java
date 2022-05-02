package co.simplon.mastershopping.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.mastershopping.dtos.ProductCreate;
import co.simplon.mastershopping.dtos.ProductName;
import co.simplon.mastershopping.entities.Product;
import co.simplon.mastershopping.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService service;
	public ProductController (ProductService service) {
		this.service=service;
	}
	
	@GetMapping
	public List<ProductName> getProductNames(){
		return service.getProductNames();
	}
	
	@PostMapping("/create")
	public void createProduct(@Valid @RequestBody ProductCreate product) {
		 service.createProduct(product);
	}
}
