package edu.pucmm.eict.graphqlspringboot;

import edu.pucmm.eict.graphqlspringboot.entidades.Actor;
import edu.pucmm.eict.graphqlspringboot.entidades.Pelicula;
import edu.pucmm.eict.graphqlspringboot.entidades.Personaje;
import edu.pucmm.eict.graphqlspringboot.repositorios.ActorRepository;
import edu.pucmm.eict.graphqlspringboot.repositorios.PeliculaRepository;
import edu.pucmm.eict.graphqlspringboot.repositorios.PersonajeRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class GraphqlSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlSpringBootApplication.class, args);
    }

    @Bean
    ApplicationRunner init(ActorRepository actorRepository,
                           PersonajeRepository personajeRepository,
                           PeliculaRepository peliculaRepository){
        return args -> {
            System.out.println("Iniciando Aplicación Demo GraphQL con Spring Boot");
            int elementos = 100;
            //Creando los actores.
            for(int i = 1; i <= elementos; i++) {
                Pelicula pelicula = new Pelicula(Long.parseLong(""+i), "Pelicula #"+i, "Descripcion Pelicula #"+i);
                peliculaRepository.save(pelicula);

                Actor actor = new Actor(Long.parseLong(""+i), "Actor #"+i, "Dominicano", "M");
                actorRepository.save(actor);

                Personaje personaje = new Personaje(Long.parseLong(""+i), "Personaje #"+i, "M", "Dominicano", pelicula);
                personaje.setActores(new HashSet<>(Arrays.asList(actor)));
                personajeRepository.save(personaje);

            }

        };
    }

}
