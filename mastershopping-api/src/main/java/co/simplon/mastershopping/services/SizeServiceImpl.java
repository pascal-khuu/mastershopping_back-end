package co.simplon.mastershopping.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.mastershopping.entities.Size;
import co.simplon.mastershopping.repositories.SizeRepository;

@Service
public class SizeServiceImpl implements SizeService {
	SizeRepository repository;

	public SizeServiceImpl(SizeRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Size> getSizes() {
		return repository.findAll();
	}

}
