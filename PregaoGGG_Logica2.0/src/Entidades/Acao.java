package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Acao
{
    private String Codigo;
    private String Nome;
    private double Valor;
    private double Dividendos;
    private static List<Acao> Disponiveis = new ArrayList<>();

    public Acao(String codigo, String nome, double valor, double dividendos)
    {
        Codigo = codigo;
        Nome = nome;
        Valor = valor;
        Dividendos = dividendos;
    }

    public String getCodigo()
    {
        return Codigo;
    }

    public void setCodigo(String codigo)
    {
        Codigo = codigo;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public double getValor()
    {
        return Valor;
    }

    public void setValor(double valor)
    {
        Valor = valor;
    }

    public double getDividendos()
    {
        return Dividendos;
    }

    public void setDividendos(double dividendos)
    {
        Dividendos = dividendos;
    }

    public List<Acao> getDisponiveis()
    {
        return Disponiveis;
    }

    public void setDisponiveis(List<Acao> disponiveis)
    {
        Disponiveis = disponiveis;
    }

    @Override
    public String toString()
    {
        return "Acao{" +
                "Codigo='" + Codigo + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Valor='" + Valor + '\'' +
                ", Dividendos=" + Dividendos +
                ", Disponiveis=" + Disponiveis +
                '}';
    }

    public static void exibirAcoes()
    {
        System.out.println("Lista de Ações Disponíveis:");
        for (Acao acao : Disponiveis)
        {
            System.out.println("Código: " + acao.getCodigo());
            System.out.println("Nome: " + acao.getNome());
            System.out.println("Valor: " + acao.getValor());
            System.out.println("Dividendos Mensais: " + acao.getDividendos());
            System.out.println();
        }
    }
}
