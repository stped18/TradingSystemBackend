package vitten.backend.vitten_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VittenBackendApplication {

	public static void main(String[] args) {
		System.out.println("Starting web app");

		SpringApplication.run(VittenBackendApplication.class, args);
	}

}
