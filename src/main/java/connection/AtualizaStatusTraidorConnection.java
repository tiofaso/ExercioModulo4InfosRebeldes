package connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AtualizaStatusTraidorConnection {
    public void traidor(int id){
        String sql = "UPDATE tb_rebeldes SET status = 'inativo' WHERE id = '" + id + "'";

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        try{

            if(conexao != null) {
                Statement statement = conexao.createStatement();
                statement.executeUpdate(sql);
            }

        }catch (SQLException e) {
            System.out.println("Não foi possível atualizar a base de dados. Veja o motivo a seguir:");

            e.printStackTrace();
        }
    }
}
