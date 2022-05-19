package co.simplon.mastershopping.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "picture_url")
	private String pictureUrl;

	@Column(name = "price")
	private float price;

	@Column(name = "number_stock")
	private float numberStock;

	@ManyToOne
	@JoinColumn(name = "categories_id")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "brands_id")
	private Brand brand;

	@ManyToOne
	@JoinColumn(name = "sizes_id")
	private Size size;

	@ManyToOne
	@JoinColumn(name = "fabrics_id")
	private Fabric fabric;

	public Product() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Fabric getFabric() {
		return fabric;
	}

	public void setFabric(Fabric fabric) {
		this.fabric = fabric;
	}

	public float getNumberStock() {
		return numberStock;
	}

	public void setNumberStock(float numberStock) {
		this.numberStock = numberStock;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", pictureUrl=" + pictureUrl + ", price=" + price
				+ ", numberStock=" + numberStock + ", category=" + category + ", brand=" + brand + ", size=" + size
				+ ", fabric=" + fabric + "]";
	}

}
