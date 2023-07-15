package tools;

public class MenuSairTools {
    private int sair;

    public int sair() {
        LeitorTecladoIntTools tecladoInt = new LeitorTecladoIntTools();

        System.out.println("\n----");
        System.out.println("Deseja sair? (0 - não | 1 - sim)");
        sair = tecladoInt.teclado();

        return sair;
    }
}
