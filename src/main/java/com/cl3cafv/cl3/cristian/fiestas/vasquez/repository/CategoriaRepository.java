package com.cl3cafv.cl3.cristian.fiestas.vasquez.repository;

import com.cl3cafv.cl3.cristian.fiestas.vasquez.model.categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
}
