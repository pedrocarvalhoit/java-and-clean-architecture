package br.com.blackbelt.escola.academico.dominio.aluno;

import br.com.blackbelt.escola.academico.dominio.Evento;
import br.com.blackbelt.escola.academico.dominio.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {

    public void reageAoEvento(Evento evento){
        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(String.format(
                "Aluno com CPF %s matriculado em: %s"
                ,((AlunoMatriculado)evento).getCpfDoAluno()
                ,momentoFormatado));
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
