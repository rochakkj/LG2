package Entidades;

import java.io.IOException;
import java.util.Scanner;
import ControleDeDados.LimpaTela;

public class Investidor
{
    private static boolean[] acao;
    private String Nome;
    private String CPF;
    private int corretoraEscolhida;

    public Investidor(String nome, String CPF)
    {
        Nome = nome;
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

    public String getCPF()
    {
        return CPF;
    }

    public void setCPF(String CPF)
    {
        this.CPF = CPF;
    }

    public int getCorretoraEscolhida()
    {
        return corretoraEscolhida;
    }

    public void setCorretoraEscolhida(int corretoraEscolhida)
    {
        corretoraEscolhida = corretoraEscolhida;
    }

    @Override
    public String toString()
    {
        return "Investidor{" +
                "Nome='" + Nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", Escolhida=" + corretoraEscolhida +
                '}';
    }

    public static void Funcional(String nome, String CPF, Integer corretoraEscolhida)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SEJA BEM VINDO!!!");
        System.out.println();
        System.out.println("Esse programa simula a COMPRA e VENDA de ações da vida real!!");
        System.out.println();
        System.out.println("Comece por se cadastrar como um INVESTIDOR!!");
        System.out.println("Digite o seu NOME: ");
        nome = scanner.nextLine();
        System.out.println("Digite o seu CPF: ");
        CPF = scanner.nextLine();
        System.out.println();
        System.out.println("Acabou de ser Cadastrado!");

        Investidor investidor = new Investidor(nome, CPF);

        System.out.println(investidor);

        System.out.println();
        System.out.println();
        System.out.println("Agora você precisa escolher uma CORRETORA!!!");
        System.out.println();
        Corretora.exibirCorretoras(null,null,null);
        System.out.println("Qual você deseja Contratar: Digite o NÚMERO da corretora");
        corretoraEscolhida = scanner.nextInt();
        if (corretoraEscolhida == 1)
        {
            Corretora corretora1 = new Corretora("BTG", "R. Clodomiro Amazonas, 249",40.0);
            System.out.println(corretora1);
        } else if (corretoraEscolhida == 2)
        {
            Corretora corretora2 = new Corretora("Safra", "Av. Paulista, 2100",30.0);
            System.out.println(corretora2);
        } else if (corretoraEscolhida == 3)
        {
            Corretora corretora3 = new Corretora("Toro Investimentos", "R. Cincinato Braga, 340",0.0);
            System.out.println(corretora3);
        } else if (corretoraEscolhida == 4)
        {
            Corretora corretora4 = new Corretora("Rico", "Av. Chedid Jafet, 75",0.0);
            System.out.println(corretora4);
        } else if (corretoraEscolhida == 5)
        {
            Corretora corretora5 = new Corretora("Nu Invest", "Av. Manuel Bandeira, 360",0.0);
            System.out.println(corretora5);
        }

        int escolha, i;
        System.out.println("Deseja comprar ou vender uma AÇÃO? Digite 1 para COMPRAR ou 2 para VENDER");
        escolha = scanner.nextInt();
        if (escolha == 1)
        {
        do {
            Acao.exibirAcao();
            System.out.println("Qual você deseja Comprar: Digite o NÚMERO da Ação");
            int CompraVenda = scanner.nextInt();
                if (CompraVenda == 1)
                {
                    Acao acao1 = new Acao("ABEV3", "Ambev", 18.61);
                    System.out.println("1 " + acao1);
                    System.out.println("AÇÃO COMPRADA");
                    Ativos ativos = new Ativos(acao1);
                }else if (CompraVenda == 2) {
                    Acao acao2 = new Acao("BBAS3", "Banco do Brasil", 40.11);
                    System.out.println("2 " + acao2);
                    System.out.println("AÇÃO COMPRADA");
                    Ativos ativos = new Ativos(acao2);
                } else if (CompraVenda == 3) {
                    Acao acao3 = new Acao("CRFB3", "Carrefour", 26.86);
                    System.out.println("3 " + acao3);
                    System.out.println("AÇÃO COMPRADA");
                    Ativos ativos = new Ativos(acao3);
                } else if (CompraVenda == 4) {
                    Acao acao4 = new Acao("ELET6", "Eletrobras", 43.02);
                    System.out.println("4 " + acao4);
                    System.out.println("AÇÃO COMPRADA");
                    Ativos ativos = new Ativos(acao4);
                } else if (CompraVenda == 5) {
                    Acao acao5 = new Acao("NTCO3", "Natura & Co.", 34.25);
                    System.out.println("5 " + acao5);
                    System.out.println("AÇÃO COMPRADA");
                    Ativos ativos = new Ativos(acao5);
                } else if (CompraVenda == 6) {
                    Acao acao6 = new Acao("ITUB4", "Itaú", 28.71);
                    System.out.println("6 " + acao6);
                    System.out.println("AÇÃO COMPRADA");
                    Ativos ativos = new Ativos(acao6);
                } else if (CompraVenda == 7) {
                    Acao acao7 = new Acao("LREN3", "Lojas Renner", 51.98);
                    System.out.println("7 " + acao7);
                    System.out.println("AÇÃO COMPRADA");
                    Ativos ativos = new Ativos(acao7);
                } else if (CompraVenda == 8) {
                    Acao acao8 = new Acao("PETR3", "Petrobras", 29.12);
                    System.out.println("8 " + acao8);
                    System.out.println("AÇÃO COMPRADA");
                    Ativos ativos = new Ativos(acao8);
                } else if (CompraVenda == 9) {
                    Acao acao9 = new Acao("RADL3", "RaiaDrogasil", 24.98);
                    System.out.println("9" + acao9);
                    System.out.println("AÇÃO COMPRADA");
                    Ativos ativos = new Ativos(acao9);
                }
                System.out.println();
                System.out.println("Deseja comprar mais alguma ação? Digite 1 para Sim e 0 para Não");
                i = scanner.nextInt();
            } while (i == 1);
        }else if (escolha == 2) {
            System.out.println();
            System.out.println();
            int j = 1;
            do{
                Acao.exibirAcao();
                System.out.println("Digite o número da AÇÃO COMPRADA: ");
                int acaoComprada = scanner.nextInt();
                if (acaoComprada == 1)
                {
                    Acao acao1 = new Acao("ABEV3", "Ambev", 18.61);
                    System.out.println("1 " + acao1);
                    System.out.println("AÇÃO VENDIDA");
                }else if (acaoComprada == 2) {
                    Acao acao2 = new Acao("BBAS3", "Banco do Brasil", 40.11);
                    System.out.println("2 " + acao2);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 3) {
                    Acao acao3 = new Acao("CRFB3", "Carrefour", 26.86);
                    System.out.println("3 " + acao3);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 4) {
                    Acao acao4 = new Acao("ELET6", "Eletrobras", 43.02);
                    System.out.println("4 " + acao4);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 5) {
                    Acao acao5 = new Acao("NTCO3", "Natura & Co.", 34.25);
                    System.out.println("5 " + acao5);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 6) {
                    Acao acao6 = new Acao("ITUB4", "Itaú", 28.71);
                    System.out.println("6 " + acao6);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 7) {
                    Acao acao7 = new Acao("LREN3", "Lojas Renner", 51.98);
                    System.out.println("7 " + acao7);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 8) {
                    Acao acao8 = new Acao("PETR3", "Petrobras", 29.12);
                    System.out.println("8 " + acao8);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 9) {
                    Acao acao9 = new Acao("RADL3", "RaiaDrogasil", 24.98);
                    System.out.println("9" + acao9);
                    System.out.println("AÇÃO VENDIDA");
                }
                System.out.println();
                System.out.println("Deseja vender outra AÇÃO? Digite 1 pa Sim ou 0 para Não ");
                j = scanner.nextInt();
            }while(j == 1);
        }
        System.out.println("Deseja VENDER alguma AÇÃO? Digite 1 pa Sim ou 0 para Não");
        int a = scanner.nextInt();
        if (a == 1)
        {
            System.out.println();
            System.out.println();
            int j = 1;
            do {
                Acao.exibirAcao();
                System.out.println("Digite o número da AÇÃO COMPRADA: ");
                int acaoComprada = scanner.nextInt();
                if (acaoComprada == 1) {
                    Acao acao1 = new Acao("ABEV3", "Ambev", 18.61);
                    System.out.println("1 " + acao1);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 2) {
                    Acao acao2 = new Acao("BBAS3", "Banco do Brasil", 40.11);
                    System.out.println("2 " + acao2);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 3) {
                    Acao acao3 = new Acao("CRFB3", "Carrefour", 26.86);
                    System.out.println("3 " + acao3);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 4) {
                    Acao acao4 = new Acao("ELET6", "Eletrobras", 43.02);
                    System.out.println("4 " + acao4);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 5) {
                    Acao acao5 = new Acao("NTCO3", "Natura & Co.", 34.25);
                    System.out.println("5 " + acao5);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 6) {
                    Acao acao6 = new Acao("ITUB4", "Itaú", 28.71);
                    System.out.println("6 " + acao6);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 7) {
                    Acao acao7 = new Acao("LREN3", "Lojas Renner", 51.98);
                    System.out.println("7 " + acao7);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 8) {
                    Acao acao8 = new Acao("PETR3", "Petrobras", 29.12);
                    System.out.println("8 " + acao8);
                    System.out.println("AÇÃO VENDIDA");
                } else if (acaoComprada == 9) {
                    Acao acao9 = new Acao("RADL3", "RaiaDrogasil", 24.98);
                    System.out.println("9" + acao9);
                    System.out.println("AÇÃO VENDIDA");
                }
                System.out.println();
                System.out.println("Deseja vender outra AÇÃO? Digite 1 pa Sim ou 0 para Não ");
                j = scanner.nextInt();
            } while (j == 1);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("VOLTE SEMPRE!!!");
        }
    }
}
