package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

public class InsereDenunciaTraidorConnection {
    public void insereTraidor(int idDelator, int idTraidor){
        String sql = "INSERT INTO tb_traidor (id_delator, id_Traidor) VALUES ('" +
                idDelator + "','"  +  idTraidor + "')";

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        //Primeira inserção de dados
            try{
            if(conexao != null) {
                Statement statement = conexao.createStatement();

                statement.executeUpdate(sql);

                System.out.println("Denúncia enviada com sucesso!");
            }

        }catch (
        SQLException e) {
            System.out.println("Não foi possível fazer a denúncia. Veja o motivo a seguir:");

            e.printStackTrace();
        }
    }

    public int tresStrikes(int idTraidor){
        String sql = "SELECT id_traidor FROM tb_traidor";
        int tresVezes = 0;

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        try {
            if (conexao != null) {
                Statement statement = conexao.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    if(resultSet.getInt("id_traidor") == idTraidor) {
                        tresVezes = tresVezes + 1;
                    }

                }

            }

        } catch (SQLException e) {
            System.out.println("Não foi possível listar os nomes. Veja o motivo a seguir:");

            e.printStackTrace();
        }

        return tresVezes;
    }


}
