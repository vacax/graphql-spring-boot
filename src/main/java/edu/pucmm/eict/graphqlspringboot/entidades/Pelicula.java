package edu.pucmm.eict.graphqlspringboot.entidades;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pelicula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GraphQLQuery(name = "id", description = "Id de la pelicula")
    Long id;
    @GraphQLQuery(name = "titulo", description = "Titulo de la pelicula")
    String titulo;
    String descripcion;
    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL)
    Set<Personaje> personajes;

    public Pelicula(Long id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
}
