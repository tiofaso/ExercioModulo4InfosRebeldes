package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaConnection {//Consulta dados na DB
    public void consultaDados() {

        String sql = "SELECT * FROM tb_rebeldes ORDER BY id";

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        try{
            if(conexao != null) {
                Statement statement = conexao.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);

                System.out.println("-------------------------------------------------------------------------------------------------------------");

                while (resultSet.next()) {
                    System.out.println("ID: " + resultSet.getLong("id") +
                            " | NOME: " + resultSet.getString("nome") +
                            " | IDADE: " + resultSet.getString("idade") +
                            " | GÊNERO: " + resultSet.getString("genero") +
                            " | TERRA NATAL: " + resultSet.getString("terranatal") +
                            " | STATUS: " + resultSet.getString("status"));
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                }

            }

        }catch (SQLException e) {
            System.out.println("Não foi possível listar os nomes. Veja o motivo a seguir:");

            e.printStackTrace();
        }

    }
}
