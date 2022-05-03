package co.simplon.mastershopping.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.mastershopping.dtos.UserLogin;
import co.simplon.mastershopping.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  <Optional> void findByUserNameAndPassword(String userName, String password);

}
