package br.com.blackbelt.escola.academico.infra.aluno;

import br.com.blackbelt.escola.academico.dominio.aluno.Aluno;
import br.com.blackbelt.escola.academico.dominio.aluno.exceptions.AlunoNaoEncontrado;
import br.com.blackbelt.escola.academico.dominio.aluno.AlunoRepository;
import br.com.blackbelt.escola.academico.dominio.aluno.Cpf;

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
                .filter(a -> String.valueOf(a.getCpf()).equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculado() {
        return this.matriculados;
    }
}
