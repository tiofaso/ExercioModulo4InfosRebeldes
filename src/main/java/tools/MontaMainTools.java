package tools;

import Extras.RebeldesLogoExtras;
import connection.ConsultaConnection;

public class MontaMainTools {
    public void menu(){
        RebeldesLogoExtras logo = new RebeldesLogoExtras();
        logo.logo();

        MenuTools menu = new MenuTools();
        menu.mostraMenu();
    }
}
