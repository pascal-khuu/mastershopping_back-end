package co.simplon.mastershopping.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.mastershopping.entities.Brand;
import co.simplon.mastershopping.services.BrandService;

@RequestMapping("/brands")
@RestController
public class BrandController {

	private BrandService service;

	public BrandController(BrandService service) {
		this.service = service;
	}

	@GetMapping
	public List<Brand> getBrands() {

		return service.getBrands();

	}
}
