package br.com.blackbelt.escola.dominio.aluno.matricular;

import br.com.blackbelt.escola.dominio.aluno.AlunoRepository;
import br.com.blackbelt.escola.dominio.aluno.Cpf;
import br.com.blackbelt.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatricularAlunoTest {

    @Test
    public void alunoDeveriaSerPersistido(){

        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDto dto = new MatricularAlunoDto("Pedro Duarte", "123.123.123-55", "ppa@gmail.com");
        useCase.executa(dto);

        assertEquals("123.123.123-55", repositorio.buscarPorCpf(new Cpf("123.123.123-55")).getCpf());

    }

}