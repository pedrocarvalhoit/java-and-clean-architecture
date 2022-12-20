package escola;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class CpfTest {

    @Test
    public void deveriaCadastrarCpfValido(){
        String numero = "111.222.333-45";
        Cpf cpf = new Cpf(numero);
        assertEquals(numero, cpf.getNumero());
        assertNotNull(cpf);
    }

    @Test
    public void naoDeveriaCadastrarNumeoInvalido(){
        assertThrows(IllegalArgumentException.class, () -> new Cpf(null));
        assertThrows(IllegalArgumentException.class, () -> new Cpf(""));
        assertThrows(IllegalArgumentException.class, () -> new Cpf("cpfinvalido"));
    }

}