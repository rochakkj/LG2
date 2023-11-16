package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Acao
{
    private String Codigo;
    private String Nome;
    private double Valor;

    public Acao(String codigo, String nome, double valor)
    {
        Codigo = codigo;
        Nome = nome;
        Valor = valor;
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


    @Override
    public String toString()
    {
        return "Acao{" +
                "Codigo='" + Codigo + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Valor='" + Valor + '\'' +
                '}';
    }

    public static void exibirAcao()
    {
        Acao acao1 = new Acao("ABEV3", "Ambev", 18.61);
        Acao acao2 = new Acao("BBAS3", "Banco do Brasil", 40.11);
        Acao acao3 = new Acao("CRFB3", "Carrefour", 26.86);
        Acao acao4 = new Acao("ELET6", "Eletrobras", 43.02);
        Acao acao5 = new Acao("NTCO3", "Natura & Co.", 34.25);
        Acao acao6 = new Acao("ITUB4", "Itaú", 28.71);
        Acao acao7 = new Acao("LREN3", "Lojas Renner", 51.98);
        Acao acao8 = new Acao("PETR3", "Petrobras", 29.12);
        Acao acao9 = new Acao("RADL3", "RaiaDrogasil", 24.98);

        System.out.println("Essas são as Ações disponíveis:");
        System.out.println("1 " + acao1);
        System.out.println("2 " + acao2);
        System.out.println("3 " + acao3);
        System.out.println("4 " + acao4);
        System.out.println("5 " + acao5);
        System.out.println("6 " + acao6);
        System.out.println("7 " + acao7);
        System.out.println("8 " + acao8);
        System.out.println("9 " + acao9);
    }
}
