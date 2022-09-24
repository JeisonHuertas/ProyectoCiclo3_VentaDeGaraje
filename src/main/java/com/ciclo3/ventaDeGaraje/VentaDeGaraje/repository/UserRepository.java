package com.ciclo3.ventaDeGaraje.VentaDeGaraje.repository;

import com.ciclo3.ventaDeGaraje.VentaDeGaraje.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
