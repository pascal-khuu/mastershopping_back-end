package co.simplon.mastershopping.services;

import java.util.List;

import javax.validation.Valid;

import co.simplon.mastershopping.dtos.ProductCreate;
import co.simplon.mastershopping.dtos.ProductUpdateView;
import co.simplon.mastershopping.dtos.ProductView;
import co.simplon.mastershopping.dtos.ProductCreate;
import co.simplon.mastershopping.dtos.ProductUpdate;
import co.simplon.mastershopping.entities.Brand;
import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.entities.Product;
import co.simplon.mastershopping.entities.Size;
import co.simplon.mastershopping.entities.User;

public interface ProductService {

	List<ProductView> getProducts();

	void createProduct(ProductCreate product);

	Product updateProductById(Long id);

	void updateProductById(Long id, @Valid ProductUpdate product);

	List<ProductUpdateView> getProductUpdate();

	void deleteProductById(Long id);

}
