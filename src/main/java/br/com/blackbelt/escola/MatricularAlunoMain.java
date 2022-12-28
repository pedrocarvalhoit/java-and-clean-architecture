package br.com.blackbelt.escola;

import br.com.blackbelt.escola.academico.dominio.aluno.AlunoRepository;
import br.com.blackbelt.escola.shared.dominio.Cpf;
import br.com.blackbelt.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.blackbelt.escola.academico.dominio.aluno.Aluno;
import br.com.blackbelt.escola.academico.dominio.aluno.Email;

//Exemplo de criação que ao longo do tempo é insustentável
public class MatricularAlunoMain {

    public static void main(String[] args) {

        String nome = "Pedro Duarte";
        Cpf cpf = new Cpf("111.222.333-45");
        Email email = new Email("pedped@gmail.com");
        String ddd = "31";
        String numero = "999995554";

        Aluno aluno = new Aluno(nome, cpf, email);
        aluno.adicionarTelefone(ddd, numero);

        AlunoRepository repository = new RepositorioDeAlunosEmMemoria();
        repository.matricular(aluno);

    }
}
