package co.simplon.mastershopping.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.mastershopping.dtos.FabricView;
import co.simplon.mastershopping.dtos.ProductCreate;
import co.simplon.mastershopping.dtos.ProductUpdateView;
import co.simplon.mastershopping.dtos.ProductView;
import co.simplon.mastershopping.dtos.ProductUpdate;
import co.simplon.mastershopping.entities.Brand;
import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.entities.Fabric;
import co.simplon.mastershopping.entities.Product;
import co.simplon.mastershopping.entities.Size;
import co.simplon.mastershopping.repositories.BrandRepository;
import co.simplon.mastershopping.repositories.CategoryRepository;
import co.simplon.mastershopping.repositories.FabricRepository;
import co.simplon.mastershopping.repositories.ProductRepository;
import co.simplon.mastershopping.repositories.SizeRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository products;
	private final CategoryRepository categories;
	private final BrandRepository brands;
	private final SizeRepository sizes;
	private final FabricRepository fabrics;

	public ProductServiceImpl(ProductRepository products, CategoryRepository categories, BrandRepository brands,
			SizeRepository sizes, FabricRepository fabrics) {
		this.products = products;
		this.categories = categories;
		this.brands = brands;
		this.sizes = sizes;
		this.fabrics = fabrics;
	}

	@Transactional
	@Override
	public void createProduct(ProductCreate dto) {
		Product entity = new Product();
		entity.setProductName(dto.getProductName());
		entity.setPictureUrl(dto.getPictureUrl());
		entity.setPrice(dto.getPrice());
		Fabric fabric = fabrics.getById(dto.getMainFabricId());
		entity.setFabric(fabric);
		entity.setNumberStock(dto.getNumberStock());
		Brand brand = brands.getById(dto.getMainBrandId());
		entity.setBrand(brand);
		Size size = sizes.getById(dto.getMainSizeId());
		entity.setSize(size);
		Category category = categories.getById(dto.getMainCategoryId());
		entity.setCategory(category);
		products.save(entity);
	}

	@Override
	public List<ProductView> getProducts() {
		return products.findAllProjectedByOrderByProductNameAsc(ProductView.class);
	}

	@Override
	public Product updateProductById(Long id) {
		return products.findById(id).get();
	}

	@Transactional
	@Override
	public void updateProductById(Long id, @Valid ProductUpdate product) {
		Product entity = products.findById(id).get();
		entity.setProductName(product.getProductName());
		entity.setPictureUrl(product.getPicture());
		entity.setPrice(product.getPrice());
		Fabric fabric = fabrics.getById(product.getMainFabricId());
		entity.setFabric(fabric);
		entity.setNumberStock(product.getNumberStock());
		Brand brand = brands.getById(product.getMainBrandId());
		entity.setBrand(brand);
		Size size = sizes.getById(product.getMainSizeId());
		entity.setSize(size);
		Category category = categories.getById(product.getMainCategoryId());
		entity.setCategory(category);
		products.save(entity);

	}

	@Override
	public List<ProductUpdateView> getProductUpdate() {
		return products.findAllProjectedByOrderByProductNameAsc(ProductUpdateView.class);
	}

	@Transactional
	@Override
	public void deleteProductById(Long id) {
		products.deleteById(id);
	}

}
