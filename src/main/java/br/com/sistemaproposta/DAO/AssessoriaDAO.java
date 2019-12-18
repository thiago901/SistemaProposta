/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.model.Administradora;
import br.com.sistemaproposta.model.Assessoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Thiago
 */
public class AssessoriaDAO {

    public static void salvar(Assessoria ass) {
        String sql ="insert into assessoria (nome,cnpj) values(?,?)";
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ass.getNome());
            ps.setString(2, ass.getCnpj());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while(rs.next()){
                int id = rs.getInt(1);
                assessoria_administradora(new Assessoria(id, ass));
                
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
    }
    private static void assessoria_administradora(Assessoria a){
        String sql = "insert into assessoria_administradora (idAssessoria,idAdministradora) values(?,?)";
        
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            for(Administradora adm: a.getAdministradoras()){
                ps.setInt(1, a.getId());
                ps.setInt(2, adm.getId());
                ps.execute();
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        
    }

    public static Assessoria getAssessoria(int codAssessoria) {
        
        String sql ="select * from assessoria where id = ?;";
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            ps.setInt(1, codAssessoria);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cnpj = rs.getString("cnpj");
                return new Assessoria(id, nome, cnpj);
                
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        return null;
    }
    
}
