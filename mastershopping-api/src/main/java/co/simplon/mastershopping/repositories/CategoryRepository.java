package co.simplon.mastershopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.mastershopping.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
