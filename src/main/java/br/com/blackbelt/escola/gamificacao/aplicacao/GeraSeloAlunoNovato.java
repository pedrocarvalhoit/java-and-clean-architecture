package br.com.blackbelt.escola.gamificacao.aplicacao;

import br.com.blackbelt.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.blackbelt.escola.gamificacao.dominio.selo.Selo;
import br.com.blackbelt.escola.shared.dominio.Cpf;
import br.com.blackbelt.escola.shared.dominio.evento.Evento;
import br.com.blackbelt.escola.shared.dominio.evento.Ouvinte;
import br.com.blackbelt.escola.shared.dominio.evento.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

    private final RepositorioDeSelos repositorioDeSelos;

    public GeraSeloAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
        this.repositorioDeSelos = repositorioDeSelos;
    }

    @Override
    protected void reageAoEvento(Evento evento) {
        Cpf cpfDoAluno = (Cpf) evento.informacoes().get("cpf");
        Selo novato = new Selo(cpfDoAluno, "Novato");
        repositorioDeSelos.adicionar(novato);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }
}
