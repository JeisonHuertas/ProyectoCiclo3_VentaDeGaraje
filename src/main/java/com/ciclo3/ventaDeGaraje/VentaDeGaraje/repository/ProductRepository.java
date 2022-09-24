package com.ciclo3.ventaDeGaraje.VentaDeGaraje.repository;

import com.ciclo3.ventaDeGaraje.VentaDeGaraje.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
