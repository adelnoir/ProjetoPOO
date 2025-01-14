package src.entities;

public class Jogador extends Pessoa{
    
    private int ranking;
    private int partidasJogadas;

    public Jogador(String nome, int idade, char genero, int ranking, int partidasJogadas)
    {
        super(nome,idade,genero);
        this.ranking = ranking;
        this.partidasJogadas = partidasJogadas;
    }

    public int getRanking() 
    {
        return ranking;
    }

    public void setRanking(int ranking) 
    {
        this.ranking = ranking;
    }

    public int getPartidasJogadas() 
    {
        return partidasJogadas;
    }

    public void setPartidasJogadas(int partidasJogadas) 
    {
        this.partidasJogadas = partidasJogadas;
    }
}
