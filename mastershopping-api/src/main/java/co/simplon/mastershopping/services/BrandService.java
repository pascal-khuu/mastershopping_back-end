package co.simplon.mastershopping.services;

import java.util.List;

import co.simplon.mastershopping.dtos.BrandView;
import co.simplon.mastershopping.entities.Brand;

public interface BrandService {

	List<BrandView> getBrands();

}
