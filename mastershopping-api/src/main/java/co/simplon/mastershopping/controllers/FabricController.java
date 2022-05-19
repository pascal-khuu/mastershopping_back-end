package co.simplon.mastershopping.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.mastershopping.entities.Fabric;
import co.simplon.mastershopping.repositories.FabricRepository;
import co.simplon.mastershopping.services.FabricService;

@RestController
@RequestMapping("/fabrics")
public class FabricController {

	private final FabricService service;

	public FabricController(FabricService service) {
		this.service = service;
	}

	@GetMapping
	public List<Fabric> getFabrics() {
		return service.getFabrics();

	}

}
