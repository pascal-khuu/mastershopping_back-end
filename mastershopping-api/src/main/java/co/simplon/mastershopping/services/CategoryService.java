package co.simplon.mastershopping.services;

import java.util.List;

import co.simplon.mastershopping.dtos.CategoryView;
import co.simplon.mastershopping.entities.Category;

public interface CategoryService {

	List<CategoryView> getCategories();

}
