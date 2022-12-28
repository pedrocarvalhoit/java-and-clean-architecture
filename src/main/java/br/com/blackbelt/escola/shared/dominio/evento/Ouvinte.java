package br.com.blackbelt.escola.shared.dominio.evento;

public abstract class Ouvinte {

    public void processa(Evento evento){
        if(this.deveProcessar(evento)){
            this.reageAoEvento(evento);
        }
    }

    protected abstract void reageAoEvento(Evento evento) ;

    protected abstract boolean deveProcessar(Evento evento);

}
