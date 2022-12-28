package br.com.blackbelt.escola.academico.dominio.aluno;

import br.com.blackbelt.escola.academico.dominio.Evento;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {

    private final Cpf cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(Cpf cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }

    public Cpf getCpfDoAluno() {
        return cpfDoAluno;
    }
}
