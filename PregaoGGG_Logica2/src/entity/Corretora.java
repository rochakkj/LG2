package entity;

public class Corretora
{
    private String Id;
    private String Nome;
    private String Endereco;
    private Investidor investidor;

    public Corretora(String id, String nome, String endereco, Investidor investidor)
    {
        Id = id;
        Nome = nome;
        Endereco = endereco;
        investidor = investidor;
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

    public String getEndereco()
    {
        return Endereco;
    }

    public void setEndereco(String endereco)
    {
        Endereco = endereco;
    }

    public Investidor getInvestidor()
    {
        return investidor;
    }

    public void setInvestidor(Investidor investidor)
    {
        this.investidor = investidor;
    }

    @Override
    public String toString()
    {
        return "Corretora{" +
                "Id='" + Id + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Endereco='" + Endereco + '\'' +
                ", investidor=" + investidor +
                '}';
    }
}
