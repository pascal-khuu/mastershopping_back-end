package co.simplon.mastershopping.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ProductCreate {

	@NotNull
	@NotBlank
	String productName;
	
	@NotNull
	@NotBlank
	String brand;
	
	@NotNull
	@Positive
	Float price;
	
	@NotNull
	@NotBlank
	String size;
	
	@NotNull
	@NotBlank
	String fabrics;
	
	@NotNull
	private Long mainCategoryId;
	
	public ProductCreate() {
		
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFabrics() {
		return fabrics;
	}

	public void setFabrics(String fabrics) {
		this.fabrics = fabrics;
	}

	public Long getMainCategoryId() {
		return mainCategoryId;
	}

	public void setMainCategoryId(Long mainCategoryId) {
		this.mainCategoryId = mainCategoryId;
	}
	
}
