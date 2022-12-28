package br.com.blackbelt.escola.academico.dominio.aluno;

import br.com.blackbelt.escola.shared.dominio.evento.Evento;
import br.com.blackbelt.escola.shared.dominio.Cpf;
import br.com.blackbelt.escola.shared.dominio.evento.TipoDeEvento;

import java.time.LocalDateTime;
import java.util.Map;

public class AlunoMatriculado implements Evento {

    private final Cpf cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(Cpf cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }

    @Override
    public TipoDeEvento tipo() {
        return TipoDeEvento.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes() {
        return Map.of("cpf", cpfDoAluno);
    }

    public Cpf getCpfDoAluno() {
        return cpfDoAluno;
    }
}
