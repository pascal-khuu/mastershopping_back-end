package co.simplon.mastershopping.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.mastershopping.dtos.CategoryView;
import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.services.CategoryService;

@RequestMapping("/categories")
@RestController
public class CategoryController {

	CategoryService service;

	public CategoryController(CategoryService service) {
		this.service = service;
	}

	@GetMapping
	public List<CategoryView> getCategories() {
		return service.getCategories();

	}

}
