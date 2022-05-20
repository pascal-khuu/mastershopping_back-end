package co.simplon.mastershopping.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.mastershopping.dtos.SizeView;
import co.simplon.mastershopping.entities.Size;
import co.simplon.mastershopping.services.SizeService;

@RestController
@RequestMapping("/sizes")
public class SizeController {
	SizeService service;

	public SizeController(SizeService service) {
		this.service = service;
	}

	@GetMapping
	public List<SizeView> getSizes() {
		return service.getSizes();
	}
}
