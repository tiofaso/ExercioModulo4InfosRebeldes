package tools;

import java.util.HashMap;
import java.util.Map;

public class MenuTools {
    private Map<Integer,String> menu = new HashMap<Integer,String>();

    public void mostraMenu(){//Menu padrão do programa

        menu.put(1,"Inserir Rebelde no sistema");
        menu.put(2,"Atualizar Localização do Rebelde");
        menu.put(3,"Mostrar base de Rebeldes");
        menu.put(4,"Mostrar inventário dos Rebeldes");
        menu.put(5,"Mostrar localização dos Rebeldes");
        menu.put(6,"Denunciar Rebeldes");
        menu.put(7,"Mercado");
        menu.put(8,"Mostrar compras no mercado");
        menu.put(9,"Relatórios");

        System.out.println("Escolha uma das opções abaixo:");
        for (Integer key : menu.keySet()) {
            System.out.println(key + " - " + menu.get(key));
        }
    }
}
