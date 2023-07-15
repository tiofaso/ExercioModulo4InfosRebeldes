package tools;

import connection.ConsultaConnection;

public class MenuLocalizacaoTools {
    public void localizacaoAtual() {
        System.out.println("Escolha o id do Rebelde para atualizar sua localizasção");
        ConsultaConnection lista = new ConsultaConnection();
        lista.consultaDados();
    }
}
