package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaPedidosMercadoConnection {
    public void mostraPedidos(){

        String sql = "SELECT tb_rebeldes.id, tb_rebeldes.nome , " +
                " tb_compras.id_rebelde , tb_compras.arma , tb_compras.municao, tb_compras.agua, " +
                " tb_compras.comida, tb_compras.data, tb_compras.hora" +
                " FROM tb_rebeldes INNER JOIN tb_compras ON tb_compras.id_rebelde = tb_rebeldes.id" +
                " ORDER BY tb_compras.data, tb_compras.hora";

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        try{
            if(conexao != null) {
                Statement statement = conexao.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);

                while(resultSet.next()){
                    System.out.println("ID: " + resultSet.getInt("id") +
                                    " | REBELDE: "  + resultSet.getString("nome") +
                                    " | ARMA (un): "  + resultSet.getInt("arma") +
                                    " | MUNIÇÃO (un): "  + resultSet.getInt("municao") +
                                    " | ÁGUA (un): "  + resultSet.getInt("agua") +
                                    " | COMIDA (un): "  + resultSet.getInt("comida") +
                                    " | DATA: "  + resultSet.getDate("data") +
                                    " | HORA: "  + resultSet.getTime("hora"));
                            System.out.println("---------------------------------------------------");
                }


            }

        }catch (SQLException e) {
            System.out.println("Não foi possível mostrar o conteúdo do Rebelde selecionado. Veja o motivo a seguir:");

            e.printStackTrace();
        }

    }

}
