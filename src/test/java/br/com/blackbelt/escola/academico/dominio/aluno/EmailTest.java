package br.com.blackbelt.escola.academico.dominio.aluno;

import br.com.blackbelt.escola.academico.dominio.aluno.Email;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    public void deveCadastrarEmailValido(){
        Email email1 = new Email("pedropedro@gmail.com");
        assertEquals(email1.getEndereco(), "pedropedro@gmail.com");
    }

    @Test
    public void naoDeveriaCriarEmailComEnderecoInvalido(){
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));

    }

}