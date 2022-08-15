package com.example.pokemonApi;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;

import static org.assertj.core.api.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PokemonApiApplicationTests {

	@Test
	void contextLoads()  {
		/*RestApiController controller = new RestApiController();
		final String baseUrl= "http://localhost:8012/rest/auth/pokemons";
		URI uri = new URI(baseUrl);

		String result = controller.getPokemon();
		assertEquals(200,result.toString());*/
	}

}
