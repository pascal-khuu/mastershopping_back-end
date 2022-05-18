package co.simplon.mastershopping.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ProductCreate {

	String pictureUrl;

	@NotNull
	@NotBlank
	private String productName;

	@NotNull
	@Positive
	private Float price;

	@NotNull
	private Long mainFabricsId;

	@NotNull
	@Positive
	private Float numberStock;

	@NotNull
	private Long mainCategoryId;

	@NotNull
	private Long mainBrandId;

	@NotNull
	private Long mainSizeId;

	public ProductCreate() {

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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Long getMainFabricsId() {
		return mainFabricsId;
	}

	public void setMainFabricsId(Long mainFabricsId) {
		this.mainFabricsId = mainFabricsId;
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
