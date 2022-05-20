package co.simplon.mastershopping.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.mastershopping.dtos.FabricView;
import co.simplon.mastershopping.dtos.ProductUpdateView;
import co.simplon.mastershopping.dtos.ProductView;
import co.simplon.mastershopping.entities.Product;
import co.simplon.mastershopping.entities.Size;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findById(Long id);

	List<Product> findAllByOrderByProductNameAsc();

	<T> List<T> findAllProjectedBy(Class<T> type);

	<T> List<T> findAllProjectedByOrderByProductNameAsc(Class<T> type);
}
