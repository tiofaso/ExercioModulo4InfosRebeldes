package tools;

import java.util.Scanner;

public class LeitorTecladoParagrafoTools {

    private String valorDigitado;
    private String linha;

    public String teclado() {
        Scanner entrada = new Scanner(System.in);
        StringBuilder paragrafo = new StringBuilder();

        System.out.println("Digite todos itens. Para terminar digite -FIM:");

        while (!(linha = entrada.nextLine()).equalsIgnoreCase("-fim")) {
            paragrafo.append(linha).append("\n");
        }

        //Removendo os \n
        paragrafo.deleteCharAt(paragrafo.length() - 1);


        valorDigitado = paragrafo.toString();
        return valorDigitado;
    }
}
