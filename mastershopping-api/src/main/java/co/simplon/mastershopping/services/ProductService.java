package co.simplon.mastershopping.services;

import java.util.List;

import co.simplon.mastershopping.dtos.ProductCreate;
import co.simplon.mastershopping.dtos.ProductName;


public interface ProductService {

	List<ProductName> getProductNames();

	void createProduct(ProductCreate product);

}
