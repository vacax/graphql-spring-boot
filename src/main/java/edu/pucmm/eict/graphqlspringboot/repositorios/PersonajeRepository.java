package edu.pucmm.eict.graphqlspringboot.repositorios;

import edu.pucmm.eict.graphqlspringboot.entidades.Pelicula;
import edu.pucmm.eict.graphqlspringboot.entidades.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
}
