package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaInventarioConnection {
    public void mostraIventario(int id){

        String sql = "SELECT tb_rebeldes.id, tb_rebeldes.nome , tb_rebeldes.idade , tb_rebeldes.genero , tb_rebeldes.terranatal ," +
                " tb_rebeldes.status , tb_inventario.id_rebelde , tb_inventario.conteudo " +
                " FROM tb_rebeldes INNER JOIN tb_inventario ON tb_inventario.id_rebelde = '" + id + "'";

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        try{
            if(conexao != null) {
                Statement statement = conexao.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    if(resultSet.getInt("id") == id) {
                        System.out.println("ID: " + resultSet.getLong("id"));
                        System.out.println("NOME: " + resultSet.getString("nome"));
                        System.out.println("IDADE: " + resultSet.getString("idade"));
                        System.out.println("GÊNERO: " + resultSet.getString("genero"));
                        System.out.println("TERRA NATAL: " + resultSet.getString("terranatal"));
                        System.out.println("STATUS: " + resultSet.getString("status"));
                        System.out.println("\nINVENTÁRIO:");
                        System.out.println(resultSet.getString("conteudo"));
                    }
                }

            }

        }catch (SQLException e) {
            System.out.println("Não foi possível mostrar o conteúdo do Rebelde selecionado. Veja o motivo a seguir:");

            e.printStackTrace();
        }

    }

}
