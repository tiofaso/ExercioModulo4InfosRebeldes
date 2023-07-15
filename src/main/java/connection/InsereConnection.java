package connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsereConnection {//Insere dados na DB
    private String sql;
    public void insereDados (String nome, int idade, String genero, String terranatal, String status, String inventario) {

        sql = "INSERT INTO tb_rebeldes (nome,idade,genero,terranatal,status) VALUES ('" +
                nome + "','"  +  idade + "','"  +  genero + "','"  +  terranatal + "','"  +  status + "')";

        //Abrindo conexão
        Connection conexao = ConexaoConnection.getConnection();

        //Primeira inserção de dados
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

        //Pegando id do Rebelde
        ConsultaIdConnection id = new ConsultaIdConnection();
        int idRebelde = id.consultaIdDados();

        //Segunda inserção de dados
        sql = "INSERT INTO tb_inventario (id_rebelde, conteudo) VALUES ('" +
                idRebelde + "','"  +  inventario + "')";

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
