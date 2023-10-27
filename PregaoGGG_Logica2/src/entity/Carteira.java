package entity;

public class Carteira
{
    private Investidor investidor;

    public Carteira(Investidor investidor)
    {
        investidor = investidor;
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
        return "Carteira{" +
                ", investidor=" + investidor +
                '}';
    }
}
