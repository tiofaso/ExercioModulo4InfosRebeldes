package model;

import java.util.ArrayList;
import java.util.List;

public abstract class MercadoCestaModel {
    private static final List<String> cestaMercado = new ArrayList<>();

    public static List<String> getMercadoCesta() {
        return cestaMercado;
    }

    public static void setMercadoCesta(String cesta) {
        cestaMercado.add(cesta);
    }
}
