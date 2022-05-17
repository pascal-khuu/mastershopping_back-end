package co.simplon.mastershopping.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.mastershopping.dtos.ProductCreate;
import co.simplon.mastershopping.entities.Brand;
import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.entities.Product;
import co.simplon.mastershopping.entities.Size;
import co.simplon.mastershopping.services.ProductService;

//@CrossOrigin("*")
@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService service;

	public ProductController(ProductService service) {
		this.service = service;
	}

	@GetMapping
	public List<Product> getProducts() {

		return service.getProducts();

	}

	@GetMapping("/categories")
	public List<Category> getCategories() {
		return service.getCategories();
	}

	@GetMapping("/brands")
	public List<Brand> getBrands() {

		return service.getBrands();

	}

	@GetMapping("/sizes")
	public List<Size> getSizes() {

		return service.getSizes();

	}

	@PostMapping("/create")
	public void createProduct(@Valid @RequestBody ProductCreate product) {
		service.createProduct(product);
	}

	@GetMapping("/byId/{id}")
	public Product updateProductById(@PathVariable("id") Long id) {
		return service.updateProductById(id);

	}
}
