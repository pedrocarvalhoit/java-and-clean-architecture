package br.com.blackbelt.escola.dominio.aluno;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno cadastroComNomeCpfEEmail(String nome, String cpf, String email){
        this.aluno = new Aluno(nome, new Cpf(cpf), new Email(email));
        return this;
    }

    public FabricaDeAluno cadastroTelefone(String ddd, String numero){
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar(){
        return this.aluno;
    }

    //Exemplo de utilização
    public static void main(String[] args) {
        FabricaDeAluno fabrica = new FabricaDeAluno();
        Aluno aluno = fabrica.cadastroComNomeCpfEEmail("","","")
                .cadastroTelefone("31","999995558")
                .cadastroTelefone("31", "33353336")
                .criar();
    }


}
