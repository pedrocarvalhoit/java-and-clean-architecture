package br.com.blackbelt.escola.infra.aluno;

import br.com.blackbelt.escola.dominio.aluno.Aluno;
import br.com.blackbelt.escola.dominio.aluno.exceptions.AlunoNaoEncontrado;
import br.com.blackbelt.escola.dominio.aluno.AlunoRepository;
import br.com.blackbelt.escola.dominio.aluno.Cpf;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements AlunoRepository {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCpf(Cpf cpf) {
        return this.matriculados.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculado() {
        return this.matriculados;
    }
}
