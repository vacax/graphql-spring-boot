package edu.pucmm.eict.graphqlspringboot.repositorios;

import edu.pucmm.eict.graphqlspringboot.entidades.Actor;
import edu.pucmm.eict.graphqlspringboot.entidades.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
}
