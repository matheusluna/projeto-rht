package br.edu.ifpb.apigateway.entities;

import java.util.List;
import java.util.Objects;

public class Funcionario {

    private Long id;
    private String nome;
    private String login;
    private String senha;
    private String gerente;
    private List<Integer> resultados;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String login, String senha, String gerente, List<Integer> resultados) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.gerente = gerente;
        this.resultados = resultados;
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

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public List<Integer> getResultados() {
        return resultados;
    }

    public void setResultados(List<Integer> resultados) {
        this.resultados = resultados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(login, that.login) &&
                Objects.equals(senha, that.senha) &&
                Objects.equals(gerente, that.gerente) &&
                Objects.equals(resultados, that.resultados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, login, senha, gerente, resultados);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", gerente='" + gerente + '\'' +
                ", resultados=" + resultados +
                '}';
    }
}
