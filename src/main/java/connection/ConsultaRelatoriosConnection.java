package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaRelatoriosConnection {//Consulta dados na DB
    private int rebeldes = 0;
    private int traidores = 0;
    private int total;
    public void consultaDados() {

        String sql = "SELECT status FROM tb_rebeldes";

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        try{
            if(conexao != null) {
                Statement statement = conexao.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);

               while (resultSet.next()) {
                   if(resultSet.getString("status").equals("ativo")) {
                        rebeldes = rebeldes + 1;
                   }else {
                       traidores = traidores +1;
                   }

                }

               total = rebeldes + traidores;
               System.out.println("Total de Rebeldes: " + ((rebeldes*100)/total) + "%");
               System.out.println("Total de Traidores: " + ((traidores*100)/total) + "%");
            }

        }catch (SQLException e) {
            System.out.println("Não foi possível listar os nomes. Veja o motivo a seguir:");

            e.printStackTrace();
        }

    }
}
