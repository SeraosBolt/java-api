package com.api;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.api") // Especifique o pacote onde está o AlunosController
public class App 
{
    static Connection connection = ConnectionDb.getConnection();
    public static void main( String[] args )throws IOException
    
    {
        SpringApplication.run(App.class, args);
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM alunos");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("nome"));
                System.out.println(resultSet.getString("cpf"));
                System.out.println(resultSet.getString("observação"));
                System.out.println(resultSet.getString("idade"));
                
            }
            resultSet.close();
            statement.close();
            connection.close();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
