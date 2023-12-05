package com.cl3cafv.cl3.cristian.fiestas.vasquez;


import com.cl3cafv.cl3.cristian.fiestas.vasquez.model.Producto;

import com.cl3cafv.cl3.cristian.fiestas.vasquez.repository.CategoriaRepository;

import com.cl3cafv.cl3.cristian.fiestas.vasquez.repository.ProductoRepository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class Cl3CristianFiestasVasquezApplicationTests {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProductoRepository productoRepository;

	@Test
	void insertarProducto() {
		Producto producto = new Producto();


	}

}
