package com.ciclo3.ventaDeGaraje.VentaDeGaraje.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/venta-de-garaje")
public class mainController {

    @GetMapping("")
    public String inicio(){
        return "user/index";
    }

    @GetMapping("/registrarse")
    public  String signIn(){
        return "user/registro";
    }

    @GetMapping("/iniciarSesion")
    public String logIn(){
        return "user/inicioSesion";
    }

    @GetMapping("/nosotros")
    public String aboutUs(){
        return "user/nosotros";
    }

}
