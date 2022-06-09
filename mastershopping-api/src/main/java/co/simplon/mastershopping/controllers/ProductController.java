package co.simplon.mastershopping.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.mastershopping.dtos.ProductCreate;
import co.simplon.mastershopping.dtos.ProductUpdateView;
import co.simplon.mastershopping.dtos.ProductView;
import co.simplon.mastershopping.dtos.ProductUpdate;
import co.simplon.mastershopping.entities.Brand;
import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.entities.Product;
import co.simplon.mastershopping.entities.Size;
import co.simplon.mastershopping.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService service;

	public ProductController(ProductService service) {
		this.service = service;
	}

	@GetMapping
	public List<ProductView> getProducts() {
		return service.getProducts();
	}

	@GetMapping("/viewProductUpdate")
	public List<ProductUpdateView> getProductUpdate() {
		return service.getProductUpdate();
	}

	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") Long id) {
		return service.getProductById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@Valid @RequestBody ProductCreate product) {
		service.createProduct(product);
	}

	@PutMapping("/{id}")
	public void updateProduct(@PathVariable Long id, @Valid @RequestBody ProductUpdate product) {
		service.updateProductById(id, product);
	}

	@DeleteMapping("/{id}")
	public void deleteProductById(@PathVariable("id") Long id) {
		service.deleteProductById(id);

	}

}
