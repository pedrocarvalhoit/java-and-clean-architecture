package br.com.blackbelt.escola.academico.aluno;

import br.com.blackbelt.escola.academico.dominio.aluno.Aluno;
import br.com.blackbelt.escola.academico.dominio.aluno.Cpf;
import br.com.blackbelt.escola.academico.dominio.aluno.Email;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void beforeEach() {
        this.aluno = new Aluno(
                "Fulano da Silva",
                new Cpf("123.456.789-00"),
                        new Email("fulano@email.com"));
    }

    @org.junit.jupiter.api.Test
    void deveriaPermitirAdicionar1Telefone() {
        this.aluno.adicionarTelefone("11", "99999999");
        assertEquals(1, this.aluno.getTelefones().size());
    }

    @org.junit.jupiter.api.Test
    void deveriaPermitirAdicionar2Telefones() {
        this.aluno.adicionarTelefone("11", "99999999");
        this.aluno.adicionarTelefone("11", "88888888");
        assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    void naoDeveriaPermitirAdicionar3Telefones() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.aluno.adicionarTelefone("11", "99999999");
            this.aluno.adicionarTelefone("11", "88888888");
            this.aluno.adicionarTelefone("11", "77777777");
        });
    }


}