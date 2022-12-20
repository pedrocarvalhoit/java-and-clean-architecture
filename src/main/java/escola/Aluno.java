package escola;

import java.util.ArrayList;
import java.util.List;

//Entity class
public class Aluno {

    private String nome;
    private Cpf cpf;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }

}
