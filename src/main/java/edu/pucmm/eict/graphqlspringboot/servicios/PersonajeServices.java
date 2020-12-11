package edu.pucmm.eict.graphqlspringboot.servicios;

import edu.pucmm.eict.graphqlspringboot.entidades.Pelicula;
import edu.pucmm.eict.graphqlspringboot.entidades.Personaje;
import edu.pucmm.eict.graphqlspringboot.repositorios.PeliculaRepository;
import edu.pucmm.eict.graphqlspringboot.repositorios.PersonajeRepository;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@GraphQLApi
public class PersonajeServices {

    private PersonajeRepository personajeRepository;

    public PersonajeServices(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }

    @GraphQLQuery(name = "personajes", description = "Todos los personales")
    public List<Personaje> findAll(){
        return personajeRepository.findAll();
    }

    @GraphQLQuery(name = "personaje")
    public Personaje findById(Long id){
        return personajeRepository.findById(id).orElse(null);
    }
}
