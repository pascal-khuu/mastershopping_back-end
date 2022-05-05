package co.simplon.mastershopping.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import co.simplon.mastershopping.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
   User findByUsername(String username);
   Optional<User> findByUsernameIgnoreCase(String username);

}
