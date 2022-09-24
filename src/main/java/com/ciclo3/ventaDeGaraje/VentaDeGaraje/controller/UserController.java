package com.ciclo3.ventaDeGaraje.VentaDeGaraje.controller;

import com.ciclo3.ventaDeGaraje.VentaDeGaraje.model.User;
import com.ciclo3.ventaDeGaraje.VentaDeGaraje.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/inicio")
    private String showHome (){
        return "products/home";
    }

    @PostMapping("/signIn")
    public String signIn(User user){
        logger.info("usuario creado: {}", user);
        userService.save(user);
        return "redirect:inicio";
    }


}
