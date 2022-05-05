package co.simplon.mastershopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class MastershoppingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MastershoppingApiApplication.class, args);
	}

}
