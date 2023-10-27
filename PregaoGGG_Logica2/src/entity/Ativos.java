package entity;

public class Ativos
{
    private String Id;
    private String Nome;
    private double Valor;
    private String Tipo;

    public Ativos(String id, String nome, double valor, String tipo)
    {
        Id = id;
        Nome = nome;
        Valor = valor;
        Tipo = tipo;
    }

    public String getId()
    {
        return Id;
    }

    public void setId(String id)
    {
        Id = id;
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

    public String getTipo()
    {
        return Tipo;
    }

    public void setTipo(String tipo)
    {
        Tipo = tipo;
    }

    @Override
    public String toString()
    {
        return "Ativos{" +
                "Id='" + Id + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Valor=" + Valor +
                ", Tipo='" + Tipo + '\'' +
                '}';
    }
}
