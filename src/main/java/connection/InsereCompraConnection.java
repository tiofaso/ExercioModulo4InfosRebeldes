package connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

public class InsereCompraConnection {
    public void finalizaCompra(int id, int arma, int municao, int agua, int comida){
        String sql = "INSERT INTO tb_compras (id_rebelde, arma, municao, agua, comida, data, hora) VALUES ('" +
                id + "','"  + arma + "','"  + municao + "','"  + agua + "','"  + comida + "','"  + LocalDate.now() + "','" +
                LocalTime.now() + "')";

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        //Primeira inserção de dados
        try{
            if(conexao != null) {
                Statement statement = conexao.createStatement();
                statement.executeUpdate(sql);

                System.out.println("Sua compra foi cadastrada e debitada dos seus créditos");
                System.out.println("Em breve o nosso currier irá entregar o seu pedido!");
                System.out.println("(por favor, não atire nele!!!!)");
            }

        }catch (SQLException e) {
            System.out.println("Não foi possível finalizar a compra. Veja o motivo a seguir:");

            e.printStackTrace();
        }

    }
}
