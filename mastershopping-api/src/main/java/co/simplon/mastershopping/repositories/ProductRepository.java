package co.simplon.mastershopping.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.mastershopping.entities.Product;
import co.simplon.mastershopping.entities.Size;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findById(Long id);

	<T> List<T> findAllProjectedBy(Class<T> type);

	List<Product> findAllByOrderByProductNameAsc();
}
