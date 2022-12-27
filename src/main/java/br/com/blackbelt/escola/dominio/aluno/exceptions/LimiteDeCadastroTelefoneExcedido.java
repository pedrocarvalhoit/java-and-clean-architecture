package br.com.blackbelt.escola.dominio.aluno.exceptions;

public class LimiteDeCadastroTelefoneExcedido extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public LimiteDeCadastroTelefoneExcedido(){

        super ("Limite de cadastro de telefone excedido. Máximo permitido = 2");

    }

}
