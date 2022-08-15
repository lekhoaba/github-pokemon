package com.example.pokemonApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/auth")  // basic auth, password in .properties
public class RestApiController {

    @Autowired
    private RestTemplate restTemplate;

//    echo "# github-pokemon" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/lekhoaba/github-pokemon.git
//    git push -u origin main


    @GetMapping("/pokemons")
    public String getPokemon(){
        String uri= "https://pokeapi.co/api/v2";
        String results=restTemplate.getForObject(uri , String.class);
        if(results==null){
            throw new RuntimeException("No results");

        }
        return  results;
    }

}
