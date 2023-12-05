package com.cl3cafv.cl3.cristian.fiestas.vasquez.controller;

import com.cl3cafv.cl3.cristian.fiestas.vasquez.model.Producto;
import com.cl3cafv.cl3.cristian.fiestas.vasquez.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")

public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> listarTodosLosProductos() {
        return productoService.listarTodosLosProductos();
    }

    @GetMapping("/{idProducto}")
    public Producto obtenerProducto(@PathVariable("idProducto") Long idProducto) { return productoService.obtenerProducto(idProducto);
    }

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    @PutMapping("/{idProducto}")
    public Producto actualizarProducto(@PathVariable("idProducto") Long idProducto, @RequestBody Producto producto) {
        producto.setIdProducto(idProducto);
        return productoService.actualizarProducto(producto);
    }

    @DeleteMapping("/{idProducto}")
    public void eliminarProducto(@PathVariable("idProducto") Long idProducto) {
        productoService.eliminarProducto(idProducto);
    }

}
