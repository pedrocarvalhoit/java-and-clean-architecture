package br.com.blackbelt.escola.gamificacao.dominio.selo;

import br.com.blackbelt.escola.academico.dominio.aluno.Cpf;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);

    List<Selo>selosDoAlunoPorCpf(Cpf cpf);

}
