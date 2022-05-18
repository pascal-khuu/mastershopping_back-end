package co.simplon.mastershopping.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.mastershopping.entities.Fabrics;
import co.simplon.mastershopping.repositories.FabricsRepository;
import co.simplon.mastershopping.services.FabricsService;

@RestController
@RequestMapping("/fabrics")
public class FabricsController {

	private final FabricsService service;

	public FabricsController(FabricsService service) {
		this.service = service;
	}

	@GetMapping
	public List<Fabrics> getFabrics() {
		return service.getFabrics();

	}

}
