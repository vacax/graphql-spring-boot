package edu.pucmm.eict.graphqlspringboot.servicios;

import edu.pucmm.eict.graphqlspringboot.entidades.Actor;
import edu.pucmm.eict.graphqlspringboot.entidades.Pelicula;
import edu.pucmm.eict.graphqlspringboot.entidades.Personaje;
import edu.pucmm.eict.graphqlspringboot.repositorios.ActorRepository;
import edu.pucmm.eict.graphqlspringboot.repositorios.PeliculaRepository;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@GraphQLApi
public class PeliculaServices {

    private PeliculaRepository peliculaRepository;

    public PeliculaServices(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    @GraphQLQuery(name = "peliculas", description = "Todos las Peliculas")
    public List<Pelicula> findAll(){
        return peliculaRepository.findAll();
    }

    @GraphQLQuery(name = "pelicula")
    public Pelicula findById(Long id){
        return peliculaRepository.findById(id).orElse(null);
    }
}
