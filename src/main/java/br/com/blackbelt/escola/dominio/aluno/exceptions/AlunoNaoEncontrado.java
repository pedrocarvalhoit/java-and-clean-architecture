package br.com.blackbelt.escola.dominio.aluno.exceptions;

import br.com.blackbelt.escola.dominio.aluno.Cpf;

public class AlunoNaoEncontrado extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public AlunoNaoEncontrado(Cpf cpf){

        super("Aluno nao encontrado com CPF: " + cpf.getNumero());
    }

}
