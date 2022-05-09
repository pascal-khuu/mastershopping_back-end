package co.simplon.mastershopping.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.mastershopping.entities.Brand;
import co.simplon.mastershopping.entities.User;

public interface BrandRepository extends JpaRepository<Brand, Long> {
	  User findByBrandName(String username);

	Optional<Brand> findById(Long mainBrand);
}
