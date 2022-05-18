package co.simplon.mastershopping.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import co.simplon.mastershopping.dtos.ProductCreate;
import co.simplon.mastershopping.dtos.ProductPageUpdate;
import co.simplon.mastershopping.dtos.ProductUpdate;
import co.simplon.mastershopping.entities.Brand;
import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.entities.Fabrics;
import co.simplon.mastershopping.entities.Product;
import co.simplon.mastershopping.entities.Size;
import co.simplon.mastershopping.repositories.BrandRepository;
import co.simplon.mastershopping.repositories.CategoryRepository;
import co.simplon.mastershopping.repositories.FabricsRepository;
import co.simplon.mastershopping.repositories.ProductRepository;
import co.simplon.mastershopping.repositories.SizeRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository products;
	private final CategoryRepository categories;
	private final BrandRepository brands;
	private final SizeRepository sizes;
	private final FabricsRepository fabrics;

	public ProductServiceImpl(ProductRepository products, CategoryRepository categories, BrandRepository brands,
			SizeRepository sizes, FabricsRepository fabrics) {
		this.products = products;
		this.categories = categories;
		this.brands = brands;
		this.sizes = sizes;
		this.fabrics = fabrics;
	}

	@Override
	public void createProduct(ProductCreate dto) {
		Product entity = new Product();
		entity.setProductName(dto.getProductName());
		entity.setPictureUrl(dto.getPictureUrl());
		entity.setPrice(dto.getPrice());
		Long mainFabrics = dto.getMainFabricsId();
		Fabrics fabric = fabrics.findById(mainFabrics).get();
		entity.setFabrics(fabric);
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

		products.save(entity);

	}

	@Override
	public List<Product> getProducts() {
		return products.findAllByOrderByProductNameAsc();
	}

	@Override
	public Product updateProductById(Long id) {
		return products.findById(id).get();
	}

	@Override
	public void updateProductById(Long id, @Valid ProductUpdate product) {
		Product entity = products.findById(id).get();
		entity.setProductName(product.getProductName());
		entity.setPictureUrl(product.getPicture());
		entity.setPrice(product.getPrice());
		Long mainFabrics = product.getMainFabricsId();
		Fabrics fabric = fabrics.findById(mainFabrics).get();
		entity.setFabrics(fabric);
		entity.setNumberStock(product.getNumberStock());
		Long mainBrand = product.getMainBrandId();
		Brand brand = brands.findById(mainBrand).get();
		entity.setBrand(brand);
		Long mainSize = product.getMainSizeId();
		Size size = sizes.findById(mainSize).get();
		entity.setSize(size);
		Long mainCategory = product.getMainCategoryId();
		Category category = categories.findById(mainCategory).get();
		entity.setCategory(category);
		products.save(entity);

	}

	@Override
	public List<ProductPageUpdate> getProductUpdate() {
		return products.findAllProjectedBy(ProductPageUpdate.class);
	}

}
