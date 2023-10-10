package com.springweb.springweb.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springweb.springweb.app.models.Usuario;

import com.springweb.springweb.app.models.Usuario;


@Controller
@RequestMapping(value = "/app")
public class IndexController {

    @GetMapping({"/index","/","home"})
    public String index(Model model) {
        model.addAttribute("titulo", "Hola Spring Boot");
        System.out.println("Home page");
        return "index.html";
    }

    @RequestMapping("/perfil")
    public String perfi(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Chrystian Omar");
        usuario.setApellido("Redín Morales");
        //usuario.setEmail("redin1987@hotmail.com");
        model.addAttribute("usuario", usuario);
        return "perfil";
    }
}
