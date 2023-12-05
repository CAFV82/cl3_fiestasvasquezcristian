package com.cl3cafv.cl3.cristian.fiestas.vasquez.controller;

import com.cl3cafv.cl3.cristian.fiestas.vasquez.model.Producto;
import com.cl3cafv.cl3.cristian.fiestas.vasquez.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductoControllerResponsiveEntity {

    @RestController
    @RequestMapping("/producto-response-entity")
    public class ProductoControllerResponseEntity {

        @Autowired
        private ProductoController productoService;

        @GetMapping
        public ResponseEntity<List<Producto>> listarTodosLosProductos() {
            return ResponseEntity.ok(productoService.listarTodosLosProductos());
        }

        @GetMapping("/{id}")
        public ResponseEntity<Producto> obtenerProducto(@PathVariable("id") Long idProducto) {
            Producto producto = productoService.obtenerProducto(idProducto);
            return producto != null ? ResponseEntity.ok(producto) : ResponseEntity.notFound().build();
        }

        @PostMapping
        public ResponseEntity<Producto> guardarProducto(@RequestBody Producto producto) {
            Producto nuevoProducto = productoService.guardarProducto(producto);
            return new ResponseEntity<>(nuevoProducto, HttpStatus.CREATED);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Producto> actualizarProducto(@PathVariable("id") Long idProducto, @RequestBody Producto producto) {
            producto.setIdProducto(idProducto);
            Producto productoActualizado = productoService.actualizarProducto(producto);
            return productoActualizado != null ? ResponseEntity.ok(productoActualizado) : ResponseEntity.notFound().build();
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> eliminarProducto(@PathVariable("id") Long idProducto) {
            productoService.eliminarProducto(idProducto);
            return ResponseEntity.noContent().build();
        }
}
