package extras;

import java.util.HashMap;
import java.util.Map;

public class RebeldesLogoExtras {
    private Map<Integer,String> logo = new HashMap<Integer,String>();
    public void logo(){
        logo.put(1,"      d888888888888888888  d8888b    8888888888b");
        logo.put(2,"      Y888888888888888888 d88PY88b   88888888888b");
        logo.put(3,"       Y888b    88888    ,88P  Y88.  888R    X88P");
        logo.put(4,"        Y888b   88888    d88'  `88b  8888bood88P");
        logo.put(5,"8888888888888b  88888   ,8888888888. 8888PY88888888888");
        logo.put(6,"8888888888888P  88888   888P    Y888 8888  Y8888888888");
        logo.put(7," ");
        logo.put(8,"Y88b   d88b   d88P  d8888b    8888888888b  d8888888888");
        logo.put(9," 888b d8888b d888' d88PY88b   88888888888b Y8888888888");
        logo.put(10," Y888V888888V888P ,88P  Y88.  888R    X88P  Y888b");
        logo.put(11,"  888888PY888888' d88'  `88b  8888bood88P    Y888b");
        logo.put(12,"  Y8888P  Y8888P ,8888888888. 8888PY8SSt&cgmm88888b");
        logo.put(13,"   Y88P    Y88P  888P    Y888 8888  Y8888888888888P");
        logo.put(14," ");

        for (Integer key : logo.keySet()) {
            System.out.println(logo.get(key));
        }
    }
}
