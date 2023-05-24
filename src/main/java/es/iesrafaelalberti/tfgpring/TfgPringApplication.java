package es.iesrafaelalberti.tfgpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableWebSecurity
@SpringBootApplication
@CrossOrigin(origins = "http://localhost:3000")
public class TfgPringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TfgPringApplication.class, args);
	}


}
