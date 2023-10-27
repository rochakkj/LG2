package entity;

public class Custodiante
{
    private String Id;
    private String Nome;
    private String CPF;
    private Bolsa bolsa;

    public Custodiante(String id, String nome, String CPF, Bolsa bolsa)
    {
        Id = id;
        Nome = nome;
        this.CPF = CPF;
        bolsa = bolsa;
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

    public String getCPF()
    {
        return CPF;
    }

    public void setCPF(String CPF)
    {
        this.CPF = CPF;
    }

    public Bolsa getBolsa()
    {
        return bolsa;
    }

    public void setBolsa(Bolsa bolsa)
    {
        this.bolsa = bolsa;
    }

    @Override
    public String toString()
    {
        return "Custodiante{" +
                "Id='" + Id + '\'' +
                ", Nome='" + Nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", bolsa=" + bolsa +
                '}';
    }
}
