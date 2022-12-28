package br.com.blackbelt.escola.gamificacao.dominio.selo;

import br.com.blackbelt.escola.academico.dominio.aluno.Cpf;

public class Selo {

    private Cpf cpfDoAluno;
    private String nome;

    public Selo(Cpf cpfDoAluno, String nome) {
        this.cpfDoAluno = cpfDoAluno;
        this.nome = nome;
    }

    public Cpf getCpfDoAluno() {
        return cpfDoAluno;
    }

    public void setCpfDoAluno(Cpf cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
