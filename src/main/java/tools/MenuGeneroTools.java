package tools;

import java.util.HashMap;
import java.util.Map;

public class MenuGeneroTools {
    private Map<Integer,String> genero = new HashMap<Integer,String>();
    public void mostraGenero(){//Menu padrão do programa

        genero.put(1,"Homem cis");
        genero.put(2,"Mulher cis");
        genero.put(3,"Homem trans");
        genero.put(4,"Mulher trans");
        genero.put(5,"Não-binário");
        genero.put(6,"Fluído");

        for (Integer key : genero.keySet()) {
            System.out.println(key + " - " + genero.get(key));
        }

    }
}
