package br.com.blackbelt.escola.aplicacao;

import br.com.blackbelt.escola.dominio.aluno.Aluno;
import org.apache.commons.mail.EmailException;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado) throws EmailException;

}
