package br.com.blackbelt.escola.dominio.aluno.matricular;

import br.com.blackbelt.escola.dominio.aluno.Aluno;
import br.com.blackbelt.escola.dominio.aluno.Cpf;
import br.com.blackbelt.escola.dominio.aluno.Email;

public class MatricularAlunoDto {

    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno(){
        return new Aluno(
                nomeAluno,
                new Cpf(cpfAluno),
                new Email(emailAluno));
    }

}
