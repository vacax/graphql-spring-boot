package edu.pucmm.eict.graphqlspringboot.entidades;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Actor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GraphQLQuery(name = "id", description = "Id del Actor")
    Long id;
    @GraphQLQuery(name = "nombre", description = "Nombre del Actor")
    String nombre;
    @GraphQLQuery(name = "nacionalidad", description = "Nombre del Actor")
    String nacionalidad;
    String sexo;
}
