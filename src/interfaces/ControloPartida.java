package src.interfaces;

import src.entities.Jogador;

public interface ControloPartida {
    
    String aplicarRegras();
    Jogador determinarVencedor();
    double tempoPartida();

}
