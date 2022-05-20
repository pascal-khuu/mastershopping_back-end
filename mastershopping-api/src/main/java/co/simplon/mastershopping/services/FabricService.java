package co.simplon.mastershopping.services;

import java.util.List;

import co.simplon.mastershopping.dtos.FabricView;
import co.simplon.mastershopping.entities.Fabric;

public interface FabricService {

	List<FabricView> getFabrics();

}
