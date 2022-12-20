package br.com.blackbelt.escola.dominio.indicacao;

import br.com.blackbelt.escola.dominio.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {

    private Aluno indicado;
    private Aluno indicate;
    private LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicado, Aluno indicate, LocalDateTime dataIndicacao) {
        this.indicado = indicado;
        this.indicate = indicate;
        this.dataIndicacao = LocalDateTime.now();
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public Aluno getIndicate() {
        return indicate;
    }

    public LocalDateTime getDataIndicacao() {
        return dataIndicacao;
    }
}
