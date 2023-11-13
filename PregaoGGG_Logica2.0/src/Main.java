import Entidades.Acao;
import Entidades.Corretora;
import Entidades.Investidor;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo !!!");
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.nextLine();

        Investidor investidor = new Investidor(nome, cpf);
        System.out.println("Você foi cadastrado como um INVESTIDOR");


        Investidor investidor1 = new Investidor("Giovanni Zorzetto","547.130.988-09");
        Investidor investidor2 = new Investidor("Giovanni Foliene","530.222.759-15");
        Investidor investidor3 = new Investidor("Gabrel Rocha","545.631.507-02");

        Acao acao1 = new Acao("ABEV3", "Ambev", 18.61, 2.9);
        Acao acao2 = new Acao("BBAS3", "Banco do Brasil", 40.11, 1.6);
        Acao acao3 = new Acao("CRFB3", "Carrefour", 26.86, 1.1);
        Acao acao4 = new Acao("ELET6", "Eletrobras", 43.02, 2.9);
        Acao acao5 = new Acao("NTCO3", "Natura & Co.", 34.25, 2.1);
        Acao acao6 = new Acao("ITUB4", "Itaú", 28.71, 1.1);
        Acao acao7 = new Acao("LREN3", "Lojas Renner", 51.98, 0.9);
        Acao acao8 = new Acao("PETR3", "Petrobras", 29.12, 0.7);
        Acao acao9 = new Acao("RADL3", "RaiaDrogasil", 24.98, 1.3);

        Corretora corretora1 = new Corretora("C6 Bank", "Av. Nove de Julho, 3186");
        Corretora corretora2 = new Corretora("Safra", "Av. Paulista, 2100");
        Corretora corretora3 = new Corretora("BTG", "Av. Brig. Faria Lima, 3477");

        


    }
}