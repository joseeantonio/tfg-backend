package es.iesrafaelalberti.tfgpring;

import es.iesrafaelalberti.tfgpring.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.CrossOrigin;

//@EnableWebSecurity
@SpringBootApplication
@CrossOrigin(origins = "http://localhost:3000")
@EnableConfigurationProperties(RsaKeyProperties.class)
public class TfgPringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TfgPringApplication.class, args);
	}


}
