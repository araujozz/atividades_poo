package com.fatec.ads.Service;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.fatec.ads.models.Funcionario;

public class serviceDao {
    private String url = "jdbc:sqlite:database.db";
    private Connection connection;
    
    public serviceDao() throws Exception {
        connection = DriverManager.getConnection(url);

// nome, crm, telefone, especialidade, senha

        String sql = """
            CREATE TABLE IF NOT EXISTS medico (
                crm TEXT NOT NULL UNIQUE,
                nome TEXT NOT NULL,
                telefone TEXT NOT NULL,
                especialidade TEXT NOT NULL,
                senha TEXT NOT NULL
            );"""
//  nome,  cpf,  telefone,  senha
        String sql2 = """
            CREATE TABLE IF NOT EXISTS recepcionista (
                nome TEXT NOT NULL,
                cpf TEXT NOT NULL UNIQUE,
                telefone TEXT NOT NULL,
                senha TEXT NOT NULL
            );
            """;

            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.execute(sql2);
    }

    public boolean executeQuery(String sql) throws Exception {
        Statement stmt = connection.createStatement();
        return stmt.executeUpdate(sql)> 0? true : false;
    }

    public boolean executeQuery(String sql, String args[]) throws Exception {
        PreparedStatement stmt = connection.prepareStatement(sql);
        for(int i = 0; i<args.length; i++){
            stmt.setString(i+1, args[i]);
        }

        return stmt.executeUpdate() > 0? true : false;
    }

    
    public ResultSet getResult(String sql) throws Exception {
        Statement stmt = connection.createStatement();
        return stmt.executeQuery(sql);
    }

    public ResultSet getResult(String sql, String args[]) throws Exception {
        PreparedStatement stmt = connection.prepareStatement(sql);
        for(int i = 0; i<args.length; i++){
            stmt.setString(i+1, args[i]);
        }

        return stmt.executeQuery();
    }



}
