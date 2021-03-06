package br.edu.ifpb.apigateway.entities;

import java.util.List;
import java.util.Objects;

public class Gerente {

    private Long id;
    private String nome;
    private String login;
    private String senha;
    private List<Integer> funcionarios;

    public Gerente() {
    }

    public Gerente(Long id, String nome, String login, String senha, List<Integer> funcionarios) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.funcionarios = funcionarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Integer> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Integer> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gerente gerente = (Gerente) o;
        return Objects.equals(id, gerente.id) &&
                Objects.equals(nome, gerente.nome) &&
                Objects.equals(login, gerente.login) &&
                Objects.equals(senha, gerente.senha) &&
                Objects.equals(funcionarios, gerente.funcionarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, login, senha, funcionarios);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
