package br.com.blackbelt.escola.academico.aplicacao;

import br.com.blackbelt.escola.academico.dominio.aluno.Aluno;
import org.apache.commons.mail.EmailException;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado) throws EmailException;

}
