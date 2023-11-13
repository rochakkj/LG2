package Entidades;

public class Carteira
{
    private String Nome;

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

    @Override
    public String toString()
    {
        return "Carteira{" +
                "Nome='" + Nome + '\'' +
                '}';
    }
}
