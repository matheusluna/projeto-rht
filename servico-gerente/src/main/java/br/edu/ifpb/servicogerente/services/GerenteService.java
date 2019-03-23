package br.edu.ifpb.servicogerente.services;

import br.edu.ifpb.servicogerente.entities.Gerente;
import br.edu.ifpb.servicogerente.repositories.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenteService {

    @Autowired
    private GerenteRepository gerenteRepository;

    public void create(Gerente gerente){
        this.gerenteRepository.save(gerente);
    }

    public Gerente read(String login){
        return gerenteRepository.findByLogin(login);
    }

    public void update(Gerente gerente){
        this.gerenteRepository.save(gerente);
    }

    public void delete(Gerente gerente){
        this.gerenteRepository.delete(gerente);
    }

    public List<Gerente> list(){
        return this.gerenteRepository.findAll();
    }
}
