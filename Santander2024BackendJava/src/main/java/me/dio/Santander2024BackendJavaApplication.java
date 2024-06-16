package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class Santander2024BackendJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Santander2024BackendJavaApplication.class, args);
	}

}
