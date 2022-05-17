package co.simplon.mastershopping.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.mastershopping.entities.Brand;
import co.simplon.mastershopping.repositories.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {
	private BrandRepository repository;

	public BrandServiceImpl(BrandRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Brand> getBrands() {

		return repository.findAll();
	}

}
