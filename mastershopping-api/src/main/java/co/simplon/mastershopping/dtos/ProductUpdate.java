package co.simplon.mastershopping.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ProductUpdate {

	@NotNull
	@NotBlank
	private String productName;

	@NotNull
	@NotBlank
	private String pictureUrl;

	@NotNull
	@Positive
	private Double price;

	@Positive
	private int numberStock;

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

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
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

	public int getNumberStock() {
		return numberStock;
	}

	public void setNumberStock(int numberStock) {
		this.numberStock = numberStock;
	}

}
