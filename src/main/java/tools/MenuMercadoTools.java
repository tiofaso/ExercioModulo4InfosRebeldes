package tools;

import model.MercadoCestaModel;

import java.util.HashMap;
import java.util.Map;

public class MenuMercadoTools extends MercadoCestaModel {
    private final Map<Integer, String> menu = new HashMap<Integer, String>();
    private String item;

    public void mostraMenu() {//Menu padrão do programa

        menu.put(0, "Arma (C$100)");
        menu.put(1, "Munição (C$30)");
        menu.put(2, "Água (C$5)");
        menu.put(3, "Comida (C$15)");

        LeitorTecladoStringTools teclado = new LeitorTecladoStringTools();

        for (Integer key : menu.keySet()) {
            System.out.println("Quantos itens de " + menu.get(key) + " você deseja?");
            item = teclado.teclado();
            setMercadoCesta(item);
        }
    }
}
