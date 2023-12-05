package com.cl3cafv.cl3.cristian.fiestas.vasquez.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "tbl_categorias")
@Entity
@Getter
@Setter
public class categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    private String descripcion;

    @OneToMany(mappedBy = "categoria")
    @JsonIgnore
    private List<Producto> productos;

}
