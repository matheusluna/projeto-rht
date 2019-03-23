package br.edu.ifpb.apigateway.controllers;

import br.edu.ifpb.apigateway.entities.Gerente;
import br.edu.ifpb.apigateway.entities.Login;
import br.edu.ifpb.apigateway.feingclients.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gerente")
public class GerenteController {

    @Autowired
    private Clients clients;

    @PostMapping("/cadastro")
    @CrossOrigin(value = "http://localhost:4200")
    public void create(@RequestBody Gerente gerente){
        clients.create(gerente);
    }

    @GetMapping
    public List<Gerente> list(){
        return clients.list();
    }

    @PostMapping("/login")
    @CrossOrigin(value = "http://localhost:4200")
    public Gerente login(@RequestBody Login login){
        return clients.login(login);
    }
}
