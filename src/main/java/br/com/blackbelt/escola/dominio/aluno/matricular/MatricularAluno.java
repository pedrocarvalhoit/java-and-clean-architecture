package br.com.blackbelt.escola.dominio.aluno.matricular;

import br.com.blackbelt.escola.dominio.aluno.Aluno;
import br.com.blackbelt.escola.dominio.aluno.AlunoRepository;

public class MatricularAluno {

    private final AlunoRepository repository;

    public MatricularAluno(AlunoRepository repository) {
        this.repository = repository;
    }

    //COMMAND
    public void executa(MatricularAlunoDto dados){
        Aluno novo = dados.criarAluno();
        repository.matricular(novo);
    }

}
