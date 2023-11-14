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


        System.out.println(corretora1);
        System.out.println(corretora2);
        System.out.println(corretora3);
        System.out.println();

        System.out.println("Escolha uma Corretora!");
        System.out.println("Digite o número da ação que deseja comprar: ");
        int corretoraEscolhida = scanner.nextInt();
        System.out.println("Corretora Escolhida com Sucesso!");
        if (corretoraEscolhida == 1)
        {
            System.out.println(corretora1);
        } else if (corretoraEscolhida == 2)
            {
                System.out.println(corretora2);
            } else if (corretoraEscolhida == 3)
                {
                    System.out.println(corretora3);
                }
        System.out.println();
        System.out.println();

        System.out.println("Deseja comprar uma ação? 1 para Sim e 2 para Não");
        int a = scanner.nextInt();
        if (a == 1)
        {
            System.out.println(acao1);
            System.out.println(acao2);
            System.out.println(acao3);
            System.out.println(acao4);
            System.out.println(acao5);
            System.out.println(acao6);
            System.out.println(acao7);
            System.out.println(acao8);
            System.out.println(acao9);
            System.out.println();

            int i;
            do
            {
                System.out.println("Digite o número da ação que deseja comprar: ");
                int acaoComprada = scanner.nextInt();
                System.out.println("Ação comprada com sucesso!");
                if (acaoComprada == 1)
                {
                    System.out.println(acao1);
                }else if (acaoComprada == 2){
                    System.out.println(acao2);
                }else if (acaoComprada == 3){
                    System.out.println(acao3);
                }else if (acaoComprada == 4){
                    System.out.println(acao4);
                }else if (acaoComprada == 5){
                    System.out.println(acao5);
                }else if (acaoComprada == 6){
                    System.out.println(acao6);
                }else if (acaoComprada == 7){
                    System.out.println(acao7);
                }else if (acaoComprada == 8){
                System.out.println(acao8);
                }else if (acaoComprada == 9){
                    System.out.println(acao9);
                }
                System.out.println("Deseja comprar outra ação? 1 para Sim e 0 para Não ");
                i = scanner.nextInt();
            }while (i == 1);
        }

        System.out.println();
        System.out.println();

        System.out.println("Deseja vender Ações? 1 para Sim e 0 para Não ");
        int b = scanner.nextInt();
        int j;
        do {
            if (b == 1)
            {
                System.out.println("Digite o número da ação comprada: ");
                int comprada = scanner.nextInt();
                System.out.println("Ação vendida com sucesso!");
                if (comprada == 1) {
                    System.out.println(acao1);
                } else if (comprada == 2) {
                    System.out.println(acao2);
                } else if (comprada == 3) {
                    System.out.println(acao3);
                } else if (comprada == 4) {
                    System.out.println(acao4);
                } else if (comprada == 5) {
                    System.out.println(acao5);
                } else if (comprada == 6) {
                    System.out.println(acao6);
                } else if (comprada == 7) {
                    System.out.println(acao7);
                } else if (comprada == 8) {
                    System.out.println(acao8);
                } else if (comprada == 9) {
                    System.out.println(acao9);
                }
            }
        System.out.println("Deseja vender outra ação? 1 para Sim e 0 para Não ");
        j = scanner.nextInt();
        }while (j == 1);
    }
}