package com.example.pokemonApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableWebSecurity
@ComponentScan
public class PokemonApiApplication {

	@Bean
	public RestTemplate getRestTemplate(){

		return new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(PokemonApiApplication.class, args);
	}

}
