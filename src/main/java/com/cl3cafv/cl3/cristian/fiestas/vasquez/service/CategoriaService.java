package com.cl3cafv.cl3.cristian.fiestas.vasquez.service;

import com.cl3cafv.cl3.cristian.fiestas.vasquez.model.categoria;
import java.util.List;

public interface CategoriaService {

    categoria guardarCategoria(categoria categoria);

    categoria actualizarCategoria(categoria categoria);

    void eliminarCategoria(Long idCategoria);

    categoria obtenerCategoria(Long idCategoria);

    List<categoria> listarTodasLasCategorias();
}
