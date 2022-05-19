package co.simplon.mastershopping.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.entities.Fabric;
import co.simplon.mastershopping.entities.Size;

public interface FabricRepository extends JpaRepository<Fabric, Long> {

	Optional<Fabric> findById(Long mainFabrics);

}
