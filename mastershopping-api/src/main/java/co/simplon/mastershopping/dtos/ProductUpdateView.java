package co.simplon.mastershopping.dtos;

import co.simplon.mastershopping.entities.Brand;

public interface ProductUpdateView {

	Long getId();

	String getProductName();

	Brand getBrand();

}
