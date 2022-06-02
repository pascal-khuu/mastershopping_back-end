package co.simplon.mastershopping.dtos;

import co.simplon.mastershopping.entities.Brand;
import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.entities.Fabric;
import co.simplon.mastershopping.entities.Size;

public interface ProductView {

	Long getId();

	String getPictureUrl();

	String getProductName();

	Brand getBrand();

	Size getSize();

	Fabric getFabric();

	Category getCategory();

	int getPrice();

	double getNumberStock();

}
