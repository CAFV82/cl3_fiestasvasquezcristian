package com.cl3cafv.cl3.cristian.fiestas.vasquez.service;

import com.cl3cafv.cl3.cristian.fiestas.vasquez.model.Producto;
import java.util.List;

public interface ProductoService {
    Producto guardarProducto(Producto producto);

    Producto actualizarProducto(Producto producto);

    void eliminarProducto(Long idProducto);

    Producto obtenerProducto(Long idProducto);

    List<Producto> listarTodosLosProductos();
}
