package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaIdMercadoConnection {//Consulta dados na DB
    private String status;

    public String  consultaIdMercado(int id) {

        String sql = "SELECT id,status FROM tb_rebeldes WHERE id='"+ id +"'";

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        try {
            if (conexao != null) {
                Statement statement = conexao.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    if(resultSet.getInt("id") == id) {
                        status = resultSet.getString("status");
                    }
                }

            }

        } catch (SQLException e) {
            System.out.println("Não foi possível listar os nomes. Veja o motivo a seguir:");

            e.printStackTrace();
        }

        return status;
    }
}
