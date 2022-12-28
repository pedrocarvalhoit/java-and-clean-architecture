package br.com.blackbelt.escola.academico.aplicacao.dominio.aluno;

import br.com.blackbelt.escola.gamificacao.aplicacao.GeraSeloAlunoNovato;
import br.com.blackbelt.escola.gamificacao.infra.selo.RepositorioDeSelosEmMemoria;
import br.com.blackbelt.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.blackbelt.escola.shared.dominio.Cpf;
import br.com.blackbelt.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.blackbelt.escola.academico.dominio.aluno.matricular.MatricularAluno;
import br.com.blackbelt.escola.academico.dominio.aluno.matricular.MatricularAlunoDto;
import br.com.blackbelt.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatricularAlunoTest {

    @Test
    public void alunoDeveriaSerPersistido(){
        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());
        publicador.adicionar(new GeraSeloAlunoNovato(new RepositorioDeSelosEmMemoria()));

        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio, publicador);

        MatricularAlunoDto dto = new MatricularAlunoDto("Pedro Duarte", "123.123.123-55", "ppa@gmail.com");
        useCase.executa(dto);

        assertEquals("123.123.123-55", repositorio.buscarPorCpf(new Cpf("123.123.123-55")).getCpf().toString());

    }

}