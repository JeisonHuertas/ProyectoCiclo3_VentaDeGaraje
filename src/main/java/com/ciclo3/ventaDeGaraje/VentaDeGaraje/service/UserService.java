package com.ciclo3.ventaDeGaraje.VentaDeGaraje.service;

import com.ciclo3.ventaDeGaraje.VentaDeGaraje.model.User;

import java.util.Optional;

public interface UserService {

    public User save(User user);
    public Optional<User> get(Integer id);
    public void update(User user);
    public void delete(Integer id);
}
