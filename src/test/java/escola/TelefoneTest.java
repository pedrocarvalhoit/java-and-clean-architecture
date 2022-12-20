package escola;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelefoneTest {

    @Test
    public void naoDeveriaCriarTelefoneComDDDInvalido(){
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
    }

    @Test
    public void naoDeveriaCriarTelefoneComNumeroInvalido(){
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "123"));
    }

    @Test
    public void deveriaCadastrarTelefoneComDDDENumerovalidos(){
        String ddd = "11";
        String numero = "123456789";
        Telefone telefone = new Telefone(ddd, numero);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }

}