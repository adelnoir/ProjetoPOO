package src.classes;

import src.entities.Arbitro;
import src.entities.Jogador;
import src.interfaces.ControloPartida;

public class PartidasSingulares implements ControloPartida{
    
    private Jogador jogador1;
    private Jogador jogador2;
    private Arbitro arbitro;

    public PartidasSingulares(Jogador jogador1, Jogador jogador2, Arbitro arbitro)
    {
        this.jogador1 = jogador1;   
        this.jogador2 = jogador2;
        this.arbitro = arbitro;
    }
    
    @Override
    public String aplicarRegras() {
        return "Regras: Só é permítido 2 jogadores, o tempo é de 30 minutos por partida e há apenas um vencedor.";
    }

    @Override
    public double tempoPartida() {
        return 30;
    }

    @Override
    public Jogador determinarVencedor() {
        return null;
    }
    
    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }
    
    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    

}
