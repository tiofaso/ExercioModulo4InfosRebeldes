package tools;

import extras.RebeldesLogoExtras;

public class MontaMainTools {
    public void menu(){
        RebeldesLogoExtras logo = new RebeldesLogoExtras();
        logo.logo();

        MenuTools menu = new MenuTools();
        menu.mostraMenu();
    }
}
