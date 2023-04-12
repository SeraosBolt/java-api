package com.api;
import org.postgresql.Driver;
import org.springframework.context.annotation.Configuration;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

@Configuration
public class ConnectionDb implements DataSource {
    private static final String URL = "jdbc:postgresql://localhost:5432/TorneioE-University";
    private static final String USER = "postgres";
    private static final String SENHA = "210198";
    
    @Override
    public static  Connection getConnection() throws SQLException {
        try{
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USER, SENHA);
        }catch (ClassNotFoundException e){
            throw new SQLException("Driver do PostgreSQL não encontrado", e.getMessage());
        }
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
}
