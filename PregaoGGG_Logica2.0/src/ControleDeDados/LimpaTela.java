package ControleDeDados;

import java.io.IOException;

public class LimpaTela
{
    public static void main() throws IOException, InterruptedException
    {
        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }
}
