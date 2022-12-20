package br.com.blackbelt.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

//Entity class
public class Aluno {

    private String nome;
    private Cpf cpf;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();
    private String senha;

    public Aluno(String nome, Cpf cpf, Email email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }


}
