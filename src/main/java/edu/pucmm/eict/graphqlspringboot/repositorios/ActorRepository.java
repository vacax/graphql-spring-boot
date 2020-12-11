package edu.pucmm.eict.graphqlspringboot.repositorios;

import edu.pucmm.eict.graphqlspringboot.entidades.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
}
