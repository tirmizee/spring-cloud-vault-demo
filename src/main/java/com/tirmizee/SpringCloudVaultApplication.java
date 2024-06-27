package com.tirmizee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudVaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudVaultApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner(
		@Value("${username}") String username,
		@Value("${password}") String password
	) {
		return args -> {
			System.out.println(username);
			System.out.println(password);
		};
	}

}
