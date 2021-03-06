package co.simplon.mastershopping.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.mastershopping.dtos.CategoryView;
import co.simplon.mastershopping.dtos.FabricView;
import co.simplon.mastershopping.entities.Fabric;
import co.simplon.mastershopping.repositories.FabricRepository;

@Service
public class FabricServiceImpl implements FabricService {
	private final FabricRepository repository;

	public FabricServiceImpl(FabricRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<FabricView> getFabrics() {
		return repository.findAllProjectedBy(FabricView.class);

	}
}
