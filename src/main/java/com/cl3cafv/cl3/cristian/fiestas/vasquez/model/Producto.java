package com.cl3cafv.cl3.cristian.fiestas.vasquez.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

import java.math.BigDecimal;

@Table(name = "tbl_productos")
@Entity
@Getter
@Setter
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String descripcion;
    @Column(precision = 10, scale = 2)
    private BigDecimal precio;
    private int stock;
    private TinyIntJdbcType estado;

    @ManyToOne
    private Producto producto;
}
