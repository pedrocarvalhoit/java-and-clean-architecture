package br.com.blackbelt.escola.academico.dominio.aluno.matricular;

import br.com.blackbelt.escola.academico.dominio.aluno.AlunoMatriculado;
import br.com.blackbelt.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.blackbelt.escola.academico.dominio.aluno.Aluno;
import br.com.blackbelt.escola.academico.dominio.aluno.AlunoRepository;

public class MatricularAluno {

    private final AlunoRepository repository;
    private final PublicadorDeEventos publicador;


    public MatricularAluno(AlunoRepository repository, PublicadorDeEventos publicador) {

        this.repository = repository;
        this.publicador = publicador;
    }

    //COMMAND
    public void executa(MatricularAlunoDto dados){
        Aluno novo = dados.criarAluno();
        repository.matricular(novo);

        AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
        publicador.publicar(evento);
    }



}
