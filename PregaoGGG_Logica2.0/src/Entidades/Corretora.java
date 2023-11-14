package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Corretora
{
    private String Nome;
    private String Endereco;
    private double Corretagem;
    private static List<Corretora> Disponiveis = new ArrayList<>();

    public Corretora(String nome, String endereco) {
        Nome = nome;
        Endereco = endereco;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public String getEndereco()
    {
        return Endereco;
    }

    public void setEndereco(String endereco)
    {
        Endereco = endereco;
    }

    public double getCorretagem()
    {
        return Corretagem;
    }

    public void setCorretagem(double corretagem)
    {
        Corretagem = corretagem;
    }

    public List<Corretora> getDisponiveis()
    {
        return Disponiveis;
    }

    public void setDisponiveis(List<Corretora> disponiveis)
    {
        Disponiveis = disponiveis;
    }

    @Override
    public String toString()
    {
        return "Corretora{" +
                "Nome='" + Nome + '\'' +
                ", Endereco='" + Endereco + '\'' +
                ", Corretagem=" + Corretagem +
                ", Disponiveis=" + Disponiveis +
                '}';
    }
}
