/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago
 */
public class DAO {
    protected static final String USER="root";
    protected static final String PASSWORD="adminadmin";
    protected static final String URL = "jdbc:mysql://localhost:3306/sistemaProposta?useUnicode=yes&characterEncoding=UTF-8&useTimezone=true&serverTimezone=UTC";
    protected static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    protected static Connection conexao;
    
    protected static Connection abriConexao(){
        try {
            Class.forName(DRIVER);
            return conexao = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException |SQLException ex) {
            throw new RuntimeException("Erro ao acessar o Banco",ex);
        }
    }
    
    protected static void fecharConexao(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexao",ex);
        }
        
    }
}
