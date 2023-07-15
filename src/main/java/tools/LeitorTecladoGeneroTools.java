package tools;

import java.util.Scanner;

public class LeitorTecladoGeneroTools {
    private int valorDigitado;
    private String generoFinal;

    public String teclado() {
        Scanner entrada = new Scanner(System.in);

        valorDigitado = entrada.nextInt();

        switch (valorDigitado) {
            case 1:
                generoFinal = "homem cis";
                break;
            case 2:
                generoFinal = "mulher cis";
                break;
            case 3:
                generoFinal = "homem trans";
                break;
            case 4:
                generoFinal = "mulher trans";
                break;
            case 5:
                generoFinal = "não-binário";
                break;
            case 6:
                generoFinal = "fluído";
                break;
            default:
                generoFinal = "não se aplica";

        }

        return generoFinal;
    }

}

