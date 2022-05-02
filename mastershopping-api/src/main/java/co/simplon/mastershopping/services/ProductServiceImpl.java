package co.simplon.mastershopping.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.mastershopping.dtos.ProductCreate;
import co.simplon.mastershopping.dtos.ProductName;
import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.entities.Product;
import co.simplon.mastershopping.repositories.CategoryRepository;
import co.simplon.mastershopping.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	private final ProductRepository products;
	private final CategoryRepository categories;
	public ProductServiceImpl(ProductRepository products, CategoryRepository categories) {
		this.products=products;
		this.categories=categories;
	}
	
	@Override
	public List<ProductName> getProductNames() {
		return products.findAllProjectedBy(ProductName.class);
	}

	@Override
	public void createProduct(ProductCreate dto) {
		Product entity = new Product();
		entity.setProductName(dto.getProductName());
		entity.setBrand(dto.getBrand());
		entity.setPrice(dto.getPrice());
		entity.setSize(dto.getSize());
		entity.setFabrics(dto.getFabrics());
		Long mainCategory=dto.getMainCategoryId();
		Category category =categories.findById(mainCategory).get();
		entity.setCategory(category);
		
		products.save(entity);
		
		
	}

	

}
