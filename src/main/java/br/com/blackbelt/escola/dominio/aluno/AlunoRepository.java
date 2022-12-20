package br.com.blackbelt.escola.dominio.aluno;

import java.sql.SQLException;
import java.util.List;

public interface AlunoRepository{

    void matricular(Aluno aluno) ;

    Aluno buscarPorCpf(Cpf cpf);

    List<Aluno> listarTodosAlunosMatriculado();

}
