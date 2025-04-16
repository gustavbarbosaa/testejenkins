package br.edu.catolica.workshop.controller;

import br.edu.catolica.workshop.service.ValidName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    ValidName validName;

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        validName.testeName(name);
        return "Ola, seja bem vindo" + name;
    }
}
