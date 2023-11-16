package Entidades;

public class Ativos
{
    private Acao acao;

    public Ativos(Acao acao)
    {
        this.acao = acao;
    }

    public static void criarAtivos()
    {
        Ativos ativos = new Ativos(null);
        System.out.println(ativos);
    }
}
