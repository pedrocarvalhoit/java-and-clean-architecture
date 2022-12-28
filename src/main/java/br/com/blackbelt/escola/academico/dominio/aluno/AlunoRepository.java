package br.com.blackbelt.escola.academico.dominio.aluno;

import br.com.blackbelt.escola.shared.dominio.Cpf;

import java.util.List;

public interface AlunoRepository{

    void matricular(Aluno aluno) ;

    Aluno buscarPorCpf(Cpf cpf);

    List<Aluno> listarTodosAlunosMatriculado();

}
