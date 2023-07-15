package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaLocalizacaoConnection {
    public void mostraLocalizacao(int id){

        String sql = "SELECT tb_rebeldes.id, tb_rebeldes.nome , tb_rebeldes.idade , tb_rebeldes.genero , tb_rebeldes.terranatal ," +
                " tb_rebeldes.status , tb_ultimalocalizacao.id_rebelde , tb_ultimalocalizacao.localizacao , " +
                " tb_ultimalocalizacao.data, tb_ultimalocalizacao.hora" +
                " FROM tb_rebeldes INNER JOIN tb_ultimalocalizacao ON tb_ultimalocalizacao.id_rebelde = '" + id + "'" +
                " ORDER BY tb_ultimalocalizacao.data, tb_ultimalocalizacao.hora";

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
                        System.out.println("\nHISTÓRICO:");
                    }
                }

                resultSet = statement.executeQuery(sql);


                    while(resultSet.next()){
                        if(resultSet.getInt("id") == id) {
                            System.out.println("LOCALIZAÇÃO: " + resultSet.getString("localizacao") +
                                    " | DATA: "  + resultSet.getDate("data") +
                                    " | HORA: "  + resultSet.getTime("hora"));
                            System.out.println("---------------------------------------------------");
                        }

                    }
                   if(resultSet.wasNull() == false) {
                       System.out.println("Não foi possível encontrar informações sobre esse Rebelde");
                   }
            }

        }catch (SQLException e) {
            System.out.println("Não foi possível mostrar o conteúdo do Rebelde selecionado. Veja o motivo a seguir:");

            e.printStackTrace();
        }

    }

}
