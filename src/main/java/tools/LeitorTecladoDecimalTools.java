package tools;

import java.math.BigDecimal;
import java.util.Scanner;

public class LeitorTecladoDecimalTools {
    private BigDecimal valorDigitado;

    public BigDecimal teclado() {
        Scanner entrada = new Scanner(System.in);

        valorDigitado = entrada.nextBigDecimal();
        return valorDigitado;
    }
}
