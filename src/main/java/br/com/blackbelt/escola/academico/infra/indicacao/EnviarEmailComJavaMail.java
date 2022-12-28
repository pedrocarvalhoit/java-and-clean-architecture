package br.com.blackbelt.escola.academico.infra.indicacao;

import br.com.blackbelt.escola.academico.aplicacao.EnviarEmailIndicacao;
import br.com.blackbelt.escola.academico.dominio.aluno.Aluno;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class EnviarEmailComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        String emailEscola = "";
        String senhaEscola = "";
        String emailAluno = indicado.getEmail();

        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(emailEscola, senhaEscola));
        email.setSSLOnConnect(true);

        try {
            email.setFrom(emailEscola);
            email.setSubject("Bem Vindo");
            email.setMsg("Seja bem vindo " + indicado.getNome() + ", é um prazer recebê-lo em nossa instituição.");
            email.addTo(emailAluno);
            email.send();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
