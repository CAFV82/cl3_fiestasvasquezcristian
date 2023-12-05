package com.cl3cafv.cl3.cristian.fiestas.vasquez.service.impl;


import com.cl3cafv.cl3.cristian.fiestas.vasquez.model.Producto;
import com.cl3cafv.cl3.cristian.fiestas.vasquez.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto guardarProducto(Producto producto) {
        validarProducto(producto);
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        validarProducto(producto);
        if (!productoRepository.existsById(producto.getIdProducto())) {
            throw new IllegalArgumentException("El producto con el ID especificado no existe.");
        }
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Long idProducto) {
        if (!productoRepository.existsById(idProducto)) {
            throw new IllegalArgumentException("El producto con el ID especificado no existe.");
        }
        productoRepository.deleteById(idProducto);
    }

    @Override
    public Producto obtenerProducto(Long idProducto) {
        Optional<Producto> producto = productoRepository.findById(idProducto);
        if (producto.isEmpty()) {
            throw new IllegalArgumentException("El producto con el ID especificado no existe.");
        }
        return producto.get();
    }

    @Override
    public List<Producto> listarTodosLosProductos() {
        return (List<Producto>) productoRepository.findAll();
    }

    private void validarProducto(Producto producto) {
        if (producto.getDescripcion() == null || producto.getDescripcion().trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción del producto no puede estar vacío.");
        }
        if (producto.getPrecio() == null || producto.getPrecio().compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        if (producto.getStock() == null) {
            throw new IllegalArgumentException("El stock no puede estar vacío.");
        }

        if (producto.getCategoria() == null || producto.getCategoria().getIdCategoria() == null) {
            throw new IllegalArgumentException("La Categoría asignada  no es válida.");
        }
    }
}
