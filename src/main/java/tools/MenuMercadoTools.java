package tools;

import java.util.HashMap;
import java.util.Map;

public class MenuMercadoTools {
    private Map<Integer,String> menu = new HashMap<Integer,String>();

    public void mostraMenu(){//Menu padrão do programa

        menu.put(1,"Arma");
        menu.put(2,"Munição");
        menu.put(3,"Água");
        menu.put(4,"Comida");

        for (Integer key : menu.keySet()) {
            System.out.println(key + " - " + menu.get(key));
        }
    }
}
