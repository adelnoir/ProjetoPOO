package src.classes;

import java.util.ArrayList;

public abstract class TorneioSingulares {
    
    private final ArrayList<PartidasSingulares> partidas;

    public TorneioSingulares(ArrayList<PartidasSingulares> partidas)
    {
        this.partidas = partidas;
    }

    public void adicionarPartida(PartidasSingulares partida)
    {
        this.partidas.add(partida);
    }

    public void determinarVencedor()
    {
        for (PartidasSingulares partida : this.partidas)
        {
            partida.determinarVencedor();
        }
    }
}

