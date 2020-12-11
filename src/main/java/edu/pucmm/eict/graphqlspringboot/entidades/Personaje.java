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
public class Personaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GraphQLQuery(name = "id", description = "Id del personaje")
    Long id;
    @GraphQLQuery(name = "nombre", description = "Nombre del personaje")
    String nombre;
    String sexo;
    @GraphQLQuery(name = "nacionalidad", description = "Nacionalidad del personaje")
    String nacionalidad;
    @ManyToOne
    Pelicula pelicula;
    @ManyToMany(cascade = CascadeType.ALL)
    Set<Actor> actores;

    public Personaje(Long id, String nombre, String sexo, String nacionalidad, Pelicula pelicula) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.pelicula = pelicula;
    }
}
