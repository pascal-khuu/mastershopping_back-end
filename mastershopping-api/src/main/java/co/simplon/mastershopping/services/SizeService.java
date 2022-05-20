package co.simplon.mastershopping.services;

import java.util.List;

import co.simplon.mastershopping.dtos.SizeView;
import co.simplon.mastershopping.entities.Size;

public interface SizeService {

	List<SizeView> getSizes();

}
