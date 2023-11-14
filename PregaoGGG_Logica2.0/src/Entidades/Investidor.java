package Entidades;

import java.util.HashMap;
import java.util.Map;

public class Investidor
{
    private String Nome;
    private String CPF;
    private Corretora Escolhida;
    private Map<String, Carteira> carteiras = new HashMap<>();

    public Investidor(String nome, String CPF)
    {
        Nome = nome;
        this.CPF = CPF;
        criarCarteira("Carteira");
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

    public Corretora getEscolhida()
    {
        return Escolhida;
    }

    public void setEscolhida(Corretora escolhida)
    {
        Escolhida = escolhida;
    }

    public Map<String, Carteira> getCarteiras()
    {
        return carteiras;
    }

    public void setCarteiras(Map<String, Carteira> carteiras)
    {
        this.carteiras = carteiras;
    }

    @Override
    public String toString()
    {
        return "Investidor{" +
                "Nome='" + Nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", Escolhida=" + Escolhida +
                '}';
    }

    public void criarCarteira(String nomeCarteira)
    {
        Carteira carteira = new Carteira(nomeCarteira);
        carteiras.put(nomeCarteira, carteira);
    }

    public void comprarAcao(Acao acao, int quantidade, String carteiraNome)
    {
        double custoTotal = quantidade * acao.getValor();
        Carteira carteira = carteiras.get(carteiraNome);
    }

    public boolean venderAcao(Acao acao, int quantidade, String carteiraNome)
    {
        Carteira carteira = carteiras.get(carteiraNome);
        double valorVenda = quantidade * acao.getValor();
        return true;
    }
}
