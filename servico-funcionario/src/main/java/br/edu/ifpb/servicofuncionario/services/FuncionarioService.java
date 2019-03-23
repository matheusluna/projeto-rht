package br.edu.ifpb.servicofuncionario.services;

import br.edu.ifpb.servicofuncionario.entities.Funcionario;
import br.edu.ifpb.servicofuncionario.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public void create(Funcionario funcionario){
        this.funcionarioRepository.save(funcionario);
    }

    public Funcionario read(String login){
        return this.funcionarioRepository.findByLogin(login);
    }

    public void delete(Funcionario funcionario){
        this.funcionarioRepository.delete(funcionario);
    }

    public List<Funcionario> list(){
        return this.funcionarioRepository.findAll();
    }

    public List<Funcionario> listByGerente(String gerente){
        return this.funcionarioRepository.findAllByGerente(gerente);
    }
}
