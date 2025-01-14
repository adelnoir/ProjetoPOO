package src.classes;

import src.entities.Arbitro;
import src.entities.Jogador;
import src.interfaces.ControloPartida;

public class PartidasDuplas implements ControloPartida{
    
    private Jogador jogador1Eq1;
    private Jogador jogador2Eq1;
    private Jogador jogador1Eq2;
    private Jogador jogador2Eq2;
    private Arbitro arbitro;
    private String resultado;

    public PartidasDuplas(Jogador jogador1Eq1, Jogador jogador1Eq2, Jogador jogador2Eq1, Jogador jogador2Eq2, Arbitro arbitro, String resultado)
    {
        this.jogador1Eq1 = jogador1Eq1;
        this.jogador2Eq1 = jogador2Eq1;
        this.jogador1Eq2 = jogador1Eq2;
        this.jogador2Eq2 = jogador2Eq2; 
        this.arbitro = arbitro;
        this.resultado = resultado;
    }

    @Override    
    public String aplicarRegras()
    {
        return "Regras: Joga-se em equipas de dois jogadores, estes são obrigados a jogar à vez, o tempo é de 40 minutos por partida e no fim ganham dois jogadores (da mesma equipa).";   
    }

    @Override
    public double tempoPartida()
    {
        return 40;
    }

    @Override
    public Jogador determinarVencedor()
    {
        return null;
    }

    public Jogador getJogador1Eq1() {
        return jogador1Eq1;
    }

    public void setJogador1Eq1(Jogador jogador1Eq1) {
        this.jogador1Eq1 = jogador1Eq1;
    }

    public Jogador getJogador2Eq1() {
        return jogador2Eq1;
    }

    public void setJogador2Eq1(Jogador jogador2Eq1) {
        this.jogador2Eq1 = jogador2Eq1;
    }
    
    public Jogador getJogador1Eq2() {
        return jogador1Eq2;
    }

    public void setJogador1Eq2(Jogador jogador1Eq2) {
        this.jogador1Eq2 = jogador1Eq2;
    }

    public Jogador getJogador2Eq2() {
        return jogador2Eq2;
    }

    public void setJogador2Eq2(Jogador jogador2Eq2) {
        this.jogador2Eq2 = jogador2Eq2;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    
}
