package entity;

public class Bolsa
{
    private String Id;
    private String Nome;
    private String Endereco;
    private Corretora corretora;

    public Bolsa(String id, String nome, String endereco, Corretora corretora)
    {
        Id = id;
        Nome = nome;
        Endereco = endereco;
        corretora = corretora;
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

    public Corretora getCorretora()
    {
        return corretora;
    }

    public void setCorretora(Corretora corretora)
    {
        this.corretora = corretora;
    }

    @Override
    public String toString()
    {
        return "Bolsa{" +
                "Id='" + Id + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Endereco='" + Endereco + '\'' +
                ", corretora=" + corretora +
                '}';
    }
}
