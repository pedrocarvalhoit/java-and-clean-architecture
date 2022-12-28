package br.com.blackbelt.escola.academico.dominio.aluno;

import java.util.List;

public interface AlunoRepository{

    void matricular(Aluno aluno) ;

    Aluno buscarPorCpf(Cpf cpf);

    List<Aluno> listarTodosAlunosMatriculado();

}
