import entity.*;

public class Main
{
    public static void main(String[] args)
    {
        Ativos ativos1 = new Ativos("1", "Apple", 200.0, "Ordinária");

        Investidor investidor1 = new Investidor("1","123.456.789-01", "Giovanni", "11/05/2007", (new Ativos("1","Apple",200.0,"Ordinária")));

        Corretora corretora1 = new Corretora("1", "GGG", "Pedro Vicente", (new Investidor("1","123.456.789-01", "Giovanni", "11/05/2007", (new Ativos("1","Apple",200.0,"Ordinária")))));

        Carteira carteira1 = new Carteira((new Investidor("1","123.456.789-01", "Giovanni", "11/05/2007", (new Ativos("1","Apple",200.0,"Ordinária")))));

        Bolsa bolsa1 = new Bolsa("1", "MottaStreet", "Cruzeiro do Sur",(new Corretora("1", "GGG", "Pedro Vicente", (new Investidor("1","123.456.789-01", "Giovanni", "11/05/2007", (new Ativos("1","Apple",200.0,"Ordinária")))))));

        Custodiante custodiante1 = new Custodiante("1","Rocha","234.567.890-12",(new Bolsa("1", "MottaStreet", "Cruzeiro do Sur",(new Corretora("1", "GGG", "Pedro Vicente", (new Investidor("1","123.456.789-01", "Giovanni", "11/05/2007", (new Ativos("1","Apple",200.0,"Ordinária")))))))));



    }
}