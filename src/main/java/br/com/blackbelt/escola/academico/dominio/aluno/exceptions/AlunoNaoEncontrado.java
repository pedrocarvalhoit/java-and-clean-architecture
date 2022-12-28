package br.com.blackbelt.escola.academico.dominio.aluno.exceptions;

import br.com.blackbelt.escola.shared.dominio.Cpf;

public class AlunoNaoEncontrado extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public AlunoNaoEncontrado(Cpf cpf){

        super("Aluno nao encontrado com CPF: " + cpf.getNumero());
    }

}
