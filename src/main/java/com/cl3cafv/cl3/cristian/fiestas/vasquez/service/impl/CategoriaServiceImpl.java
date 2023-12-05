package com.cl3cafv.cl3.cristian.fiestas.vasquez.service.impl;


import com.cl3cafv.cl3.cristian.fiestas.vasquez.model.categoria;
import com.cl3cafv.cl3.cristian.fiestas.vasquez.repository.CategoriaRepository;
import com.cl3cafv.cl3.cristian.fiestas.vasquez.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public categoria guardarCategoria(categoria categoria) {
        validarCategoria(categoria);
        return CategoriaRepository.save(categoria);
    }

    @Override
    public categoria actualizarCategoria(categoria categoria) {
        validarCategoria(categoria);
        if (!categoriaRepository.existsById(categoria.getIdCategoria())) {
            throw new IllegalArgumentException("La categoría con el ID especificado no existe.");
        }
        return CategoriaRepository.save(categoria);
    }

    @Override
    public void eliminarCategoria(Long idCategoria) {
        if (!categoriaRepository.existsById(idCategoria)) {
            throw new IllegalArgumentException("La Categoría con el ID especificado no existe.");
        }
        categoriaRepository.deleteById(idCategoria);
    }

    @Override
    public categoria obtenerCategoria(Long idCategoria) {
        Optional<categoria> categoria = CategoriaRepository.findById(idCategoria);
        if (categoria.isEmpty()) {
            throw new IllegalArgumentException("La Categoria con el ID especificado no existe.");
        }
        return categoria.get();
    }

   @Override
    public List<categoria> listarTodasLasCategorias() {
        return (List<categoria>) CategoriaRepository.findAll();
    }

    private void validarCategoria(categoria categoria) {
        if (categoria.getDescripcion() == null || categoria.getDescripcion().trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción de la categoria no puede estar vacía.");
        }
    }
}
