package co.simplon.mastershopping.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.mastershopping.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	<T> List<T> findAllProjectedBy(Class<T> type);

}
