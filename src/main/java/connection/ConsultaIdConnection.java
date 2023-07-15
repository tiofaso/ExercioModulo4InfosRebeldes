package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaIdConnection {//Consulta dados na DB
    private int idRebelde;

    public int consultaIdDados() {

        String sql = "SELECT id,nome FROM tb_rebeldes";

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        try {
            if (conexao != null) {
                Statement statement = conexao.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                   idRebelde = resultSet.getInt("id");
                }

            }

        } catch (SQLException e) {
            System.out.println("Não foi possível listar os nomes. Veja o motivo a seguir:");

            e.printStackTrace();
        }

        return idRebelde;
    }
}
