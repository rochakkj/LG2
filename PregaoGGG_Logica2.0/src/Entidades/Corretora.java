package Entidades;

public class Corretora
{
    private String Nome;
    private String Endereco;
    private double ValorCorretagem;

    public Corretora(String nome, String endereco, double valorCorretagem)
    {
        Nome = nome;
        Endereco = endereco;
        ValorCorretagem = valorCorretagem;
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

    public double getValorCorretagem()
    {
        return ValorCorretagem;
    }

    public void setValorCorretagem(double valorCorretagem)
    {
        ValorCorretagem = valorCorretagem;
    }

    @Override
    public String toString()
    {
        return "Corretora{" +
                "Nome='" + Nome + '\'' +
                ", Endereco='" + Endereco + '\'' +
                ", Corretagem=" + ValorCorretagem +
                '}';
    }

    public static void exibirCorretoras(String nome, String endereco, Double valorCorretagem)
    {
        Corretora corretora1 = new Corretora("BTG", "R. Clodomiro Amazonas, 249",40.0);
        Corretora corretora2 = new Corretora("Safra", "Av. Paulista, 2100",30.0);
        Corretora corretora3 = new Corretora("Toro Investimentos", "R. Cincinato Braga, 340",0.0);
        Corretora corretora4 = new Corretora("Rico", "Av. Chedid Jafet, 75",0.0);
        Corretora corretora5 = new Corretora("Nu Invest", "Av. Manuel Bandeira, 360",0.0);

        System.out.println("Essas são as Corretoras disponíveis:");
        System.out.println(corretora1);
        System.out.println(corretora2);
        System.out.println(corretora3);
        System.out.println(corretora4);
        System.out.println(corretora5);
    }
}
