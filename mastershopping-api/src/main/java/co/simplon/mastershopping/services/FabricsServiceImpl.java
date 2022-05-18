package co.simplon.mastershopping.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.mastershopping.entities.Fabrics;
import co.simplon.mastershopping.repositories.FabricsRepository;

@Service
public class FabricsServiceImpl implements FabricsService {
	private final FabricsRepository repository;

	public FabricsServiceImpl(FabricsRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Fabrics> getFabrics() {
		return repository.findAll();
	}

}
