package connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

public class AtualizaLocalizacaoConnection {
    public void novaLocalizacao(int id, String localizacao){
            String sql = "INSERT INTO tb_ultimalocalizacao (id_rebelde, localizacao, data, hora) VALUES ('" +
                    id + "','"  +  localizacao + "','"  + LocalDate.now() + "','"  + LocalTime.now() + "')";

            //Abrindo conexão
            Connection conexao = ConexaoConnection.getConnection();

            //Primeira inserção de dados
            try{
                if(conexao != null) {
                    Statement statement = conexao.createStatement();

                    statement.executeUpdate(sql);

                    System.out.println("Localização inserida com sucesso na base de dados!");
                }

            }catch (SQLException e) {
                System.out.println("Não foi possível inserir localização na base de dados. Veja o motivo a seguir:");

                e.printStackTrace();
            }

    }

}
