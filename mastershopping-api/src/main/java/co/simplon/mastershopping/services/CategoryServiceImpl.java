package co.simplon.mastershopping.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	public CategoryRepository repository;

	public CategoryServiceImpl(CategoryRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Category> getCategories() {

		return repository.findAll();
	}
}
