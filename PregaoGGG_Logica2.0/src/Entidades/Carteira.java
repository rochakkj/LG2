package Entidades;

public class Carteira
{
    private String Nome;

    private Ativos ativos;

    public Carteira(String nome)
    {
        Nome = nome;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public Ativos getAtivos()
    {
        return ativos;
    }

    public void setAtivos(Ativos ativos) {
        this.ativos = ativos;
    }

    @Override
    public String toString()
    {
        return "Carteira{" +
                "Nome='" + Nome + '\'' +
                '}';
    }
}
