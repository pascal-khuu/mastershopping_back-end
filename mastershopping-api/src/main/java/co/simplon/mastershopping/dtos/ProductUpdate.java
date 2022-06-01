package co.simplon.mastershopping.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ProductUpdate {
	String picture;

	@NotNull
	@NotBlank
	String productName;

	@NotNull
	@Positive
	Float price;

	@NotNull
	@Positive
	Float numberStock;

	@NotNull
	private Long mainCategoryId;

	@NotNull
	private Long mainBrandId;

	@NotNull
	private Long mainSizeId;

	@NotNull
	private Long mainFabricId;

	public ProductUpdate() {

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Long getMainFabricId() {
		return mainFabricId;
	}

	public void setMainFabricId(Long mainFabricId) {
		this.mainFabricId = mainFabricId;
	}

	public Long getMainCategoryId() {
		return mainCategoryId;
	}

	public void setMainCategoryId(Long mainCategoryId) {
		this.mainCategoryId = mainCategoryId;
	}

	public Long getMainBrandId() {
		return mainBrandId;
	}

	public void setMainBrandId(Long mainBrandId) {
		this.mainBrandId = mainBrandId;
	}

	public Long getMainSizeId() {
		return mainSizeId;
	}

	public void setMainSizeId(Long mainSizeId) {
		this.mainSizeId = mainSizeId;
	}

	public Float getNumberStock() {
		return numberStock;
	}

	public void setNumberStock(Float numberStock) {
		this.numberStock = numberStock;
	}

}
