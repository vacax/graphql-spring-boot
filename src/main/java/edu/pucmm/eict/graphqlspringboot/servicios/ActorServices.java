package edu.pucmm.eict.graphqlspringboot.servicios;

import edu.pucmm.eict.graphqlspringboot.entidades.Actor;
import edu.pucmm.eict.graphqlspringboot.entidades.Personaje;
import edu.pucmm.eict.graphqlspringboot.repositorios.ActorRepository;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@GraphQLApi
public class ActorServices {

    private ActorRepository actorRepository;

    public ActorServices(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @GraphQLQuery(name = "actores", description = "Todos los Actores")
    public List<Actor> findAll(){
        return actorRepository.findAll();
    }

    @GraphQLQuery(name = "actor")
    public Actor findById(Long id){
        Optional<Actor> byId = actorRepository.findById(id);
        return byId.orElse(null);
    }
}
