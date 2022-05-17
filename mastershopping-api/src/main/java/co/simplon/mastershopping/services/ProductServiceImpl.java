package co.simplon.mastershopping.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.simplon.mastershopping.dtos.ProductCreate;
import co.simplon.mastershopping.entities.Brand;
import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.entities.Product;
import co.simplon.mastershopping.entities.Size;
import co.simplon.mastershopping.repositories.BrandRepository;
import co.simplon.mastershopping.repositories.CategoryRepository;
import co.simplon.mastershopping.repositories.ProductRepository;
import co.simplon.mastershopping.repositories.SizeRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository products;
	private final CategoryRepository categories;
	private final BrandRepository brands;
	private final SizeRepository sizes;

	public ProductServiceImpl(ProductRepository products, CategoryRepository categories, BrandRepository brands,
			SizeRepository sizes) {
		this.products = products;
		this.categories = categories;
		this.brands = brands;
		this.sizes = sizes;
	}

	@Override
	public void createProduct(ProductCreate dto) {
		Product entity = new Product();
		entity.setProductName(dto.getProductName());
		entity.setPicture(dto.getPicture());
		entity.setPrice(dto.getPrice());
		entity.setFabrics(dto.getFabrics());
		entity.setNumberStock(dto.getNumberStock());
		Long mainBrand = dto.getMainBrandId();
		Brand brand = brands.findById(mainBrand).get();
		entity.setBrand(brand);
		Long mainSize = dto.getMainSizeId();
		Size size = sizes.findById(mainSize).get();
		entity.setSize(size);
		Long mainCategory = dto.getMainCategoryId();
		Category category = categories.findById(mainCategory).get();
		entity.setCategory(category);
		System.out.println(entity);

		products.save(entity);

	}

	@Override
	public List<Product> getProducts() {
		return products.findAll();
	}

	@Override
	public List<Category> getCategories() {
		return categories.findAll();
	}

	@Override
	public List<Brand> getBrands() {
		return brands.findAll();
	}

	@Override
	public List<Size> getSizes() {
		return sizes.findAll();
	}

	@Override
	public Product updateProductById(Long id) {
		// TODO Auto-generated method stub
		return products.findById(id).get();
	}

}
