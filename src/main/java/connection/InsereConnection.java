package connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsereConnection {//Insere dados na DB
    public void insereDados (String nome, int idade, String genero, String localizacao, String status) {

        String sql = "INSERT INTO tb_rebeldes (nome,idade,genero,localizacao,status) VALUES ('" +
                nome + "','"  +  idade + "','"  +  genero + "','"  +  localizacao + "','"  +  status + "')";

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        try{
            if(conexao != null) {
                Statement statement = conexao.createStatement();

                statement.executeUpdate(sql);

                System.out.println("Nome inserido com sucesso na base de dados!");
            }

        }catch (SQLException e) {
            System.out.println("Não foi possível inserir o nome na base de dados. Veja o motivo a seguir:");

            e.printStackTrace();
        }

    }
}
