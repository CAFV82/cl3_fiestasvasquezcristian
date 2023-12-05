package com.cl3cafv.cl3.cristian.fiestas.vasquez.controller;

import com.cl3cafv.cl3.cristian.fiestas.vasquez.model.categoria;
import com.cl3cafv.cl3.cristian.fiestas.vasquez.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")

public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    public List<categoria> listarTodasLasCategorias(){ return CategoriaService.listarTodasLasCategorias();
    }
}
