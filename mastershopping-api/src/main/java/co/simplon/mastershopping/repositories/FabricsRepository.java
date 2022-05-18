package co.simplon.mastershopping.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.mastershopping.entities.Category;
import co.simplon.mastershopping.entities.Fabrics;
import co.simplon.mastershopping.entities.Size;

public interface FabricsRepository extends JpaRepository<Fabrics, Long> {

	Optional<Fabrics> findById(Long mainFabrics);

}
