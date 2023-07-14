package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoConnection {
    public static Connection getConnection(){//Conexão com a DB
        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/infosrebeldes",
                    "postgres", "1248Mani!");
            return connection;
        }catch (SQLException e){
            System.out.println("Deu ruim aqui na conexão! :/");
            e.printStackTrace();
            return null;
        }
    }

    public static Connection closeConnection() {//Encerra conexão com DB
        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/infosrebeldes",
                    "postgres", "1248Mani!");
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }

        return null;
    }
}
