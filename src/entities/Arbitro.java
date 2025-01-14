package src.entities;

public class Arbitro extends Pessoa{
    
    private String certificacoes;

    public Arbitro(String nome, int idade, char genero, String certificacoes)
    {
        super(nome, idade, genero);
        this.certificacoes = certificacoes;
    }

    public String getCertificacoes()
    {
        return certificacoes;
    }

    public void setCertificacoes(String certificacoes)
    {
        this.certificacoes = certificacoes;
    }

}
