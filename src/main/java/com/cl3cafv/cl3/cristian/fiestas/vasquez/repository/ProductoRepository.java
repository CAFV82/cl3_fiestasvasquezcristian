package com.cl3cafv.cl3.cristian.fiestas.vasquez.repository;

import com.cl3cafv.cl3.cristian.fiestas.vasquez.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

    List<Producto> findByDescripcion(String descripcion);

    List<Producto> findByDescripcionContaining(String cadena);

    List<Producto> findByDescripcionStartingWith(String cadena);

    List<Producto> findByPrecio(BigDecimal precio);

    List<Producto> findByPrecioGreaterThan(BigDecimal precio);

    List<Producto> findByProductoGreaterThanEqual(BigDecimal precio);

}
