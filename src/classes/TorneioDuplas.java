package src.classes;

import java.util.ArrayList;

public class TorneioDuplas {
    
    private final ArrayList<PartidasDuplas> partidas;

    public TorneioDuplas(ArrayList<PartidasDuplas> partidas)
    {
        this.partidas = partidas;
    }

    public void adicionarPartida(PartidasDuplas partida)
    {
        this.partidas.add(partida);
    }

    public void determinarVencedor()
    {
        for (PartidasDuplas partida : this.partidas)
        {
            partida.determinarVencedor();
        }
    }

}
