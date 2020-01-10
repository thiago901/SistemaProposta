/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.controller.PropostaController;
import br.com.sistemaproposta.model.Acordo;
import br.com.sistemaproposta.model.Proposta;
import br.com.sistemaproposta.model.Usuario;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago
 */
public class UsuarioDAO {

    public static Usuario validaUsuario(int id) {
        String sql="select * from usr where id =?;";
        try {
            PreparedStatement ps =  DAO.abriConexao().prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                String login = rs.getString("login");
                String password = rs.getString("password");
                return new Usuario(id, login, password);
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        return null;
    }

    public static Usuario validaUsuario(String login, String senha) {
        String sql="select * from usr where login =? and password=?;";
        try {
            PreparedStatement ps =  DAO.abriConexao().prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                int id = rs.getInt("id");
                return new Usuario(id, login, senha);
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        return null;
    }


}
