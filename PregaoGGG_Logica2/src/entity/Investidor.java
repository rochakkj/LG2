package entity;

public class Investidor
{
    private String Id;
    private String CPF;
    private String Nome;
    private String DataNasc;
    private Ativos ativos;


    public Investidor(String id, String CPF, String nome, String dataNasc, Ativos ativos)
    {
        Id = id;
        this.CPF = CPF;
        Nome = nome;
        DataNasc = dataNasc;
        ativos = ativos;
    }

    public String getId()
    {
        return Id;
    }

    public void setId(String id)
    {
        Id = id;
    }

    public String getCPF()
    {
        return CPF;
    }

    public void setCPF(String CPF)
    {
        this.CPF = CPF;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public String getDataNasc()
    {
        return DataNasc;
    }

    public void setDataNasc(String dataNasc)
    {
        DataNasc = dataNasc;
    }

    public Ativos getAtivos()
    {
        return ativos;
    }

    public void setAtivos(Ativos ativos)
    {
        this.ativos = ativos;
    }

    @Override
    public String toString()
    {
        return "Investidor{" +
                "Id='" + Id + '\'' +
                ", CPF='" + CPF + '\'' +
                ", Nome='" + Nome + '\'' +
                ", DataNasc='" + DataNasc + '\'' +
                ", ativos=" + ativos +
                '}';
    }
}
