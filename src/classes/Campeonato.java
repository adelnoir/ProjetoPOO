package src.classes;

import java.util.ArrayList;

public class Campeonato {
    
    private final ArrayList<TorneioSingulares> torneiosSingulares;
    private final ArrayList<TorneioDuplas> torneiosDuplas;

    public Campeonato(ArrayList<TorneioSingulares> torneiosSingulares, ArrayList<TorneioDuplas> torneiosDuplas) {
        this.torneiosSingulares = torneiosSingulares;
        this.torneiosDuplas = torneiosDuplas;
    }

    public void medalharVencedoresTorneios()
    {

    }

    public ArrayList<TorneioSingulares> getTorneiosSingulares() {
        return torneiosSingulares;
    }

    public ArrayList<TorneioDuplas> getTorneiosDuplas() {
        return torneiosDuplas;
    }
}
