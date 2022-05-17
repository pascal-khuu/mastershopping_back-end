package co.simplon.mastershopping.services;

import java.util.List;

import co.simplon.mastershopping.dtos.ProductCreate;
import co.simplon.mastershopping.entities.Brand;
import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.entities.Product;
import co.simplon.mastershopping.entities.Size;
import co.simplon.mastershopping.entities.User;

public interface ProductService {

	void createProduct(ProductCreate product);

	List<Product> getProducts();

	List<Brand> getBrands();

	List<Size> getSizes();

	List<Category> getCategories();

	Product updateProductById(Long id);

}
