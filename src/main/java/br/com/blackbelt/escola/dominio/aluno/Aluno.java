package br.com.blackbelt.escola.dominio.aluno;

import br.com.blackbelt.escola.dominio.aluno.exceptions.LimiteDeCadastroTelefoneExcedido;

import java.util.ArrayList;
import java.util.List;

//Entity class
//AGGREGATE ROOT (DDD)
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
        if (telefones.size() >= 1) {
            throw new IllegalArgumentException("Limite de telefones cadastrado excedido.");
        }
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
