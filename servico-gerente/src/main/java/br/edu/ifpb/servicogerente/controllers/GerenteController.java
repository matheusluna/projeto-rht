package br.edu.ifpb.servicogerente.controllers;

import br.edu.ifpb.servicogerente.entities.Gerente;
import br.edu.ifpb.servicogerente.entities.Login;
import br.edu.ifpb.servicogerente.services.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gerente")
public class GerenteController {

    @Autowired
    private GerenteService gerenteService;

    @PostMapping("/cadastro")
    public void create(@RequestBody Gerente gerente){
        this.gerenteService.create(gerente);
    }

    @PostMapping("/login")
    public ResponseEntity<Gerente> login(@RequestBody Login login){
        Gerente gerente = this.gerenteService.read(login.getLogin());
        if(gerente != null){
            if (gerente.getSenha().equals(login.getSenha())){
                return ResponseEntity.ok(gerente);
            }else{
                return null;
            }
        }else return null;
    }

    @GetMapping
    public ResponseEntity<List<Gerente>> list(){
        return ResponseEntity.ok(this.gerenteService.list());
    }

}
