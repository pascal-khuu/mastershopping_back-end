package co.simplon.mastershopping.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.mastershopping.entities.Size;

public interface SizeRepository extends JpaRepository<Size, Long> {

	Optional<Size> findById(Long mainSize);

}
