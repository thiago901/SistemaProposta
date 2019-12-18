/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.model.Administradora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thiago
 */
public class AdministradoraDAO {
    
    public static Administradora getAdministradora(int codAdm){
        String sql="select * from administradora where id = ?";
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            ps.setInt(1, codAdm);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cnpj = rs.getString("cnpj");
                return new Administradora(id, nome, cnpj);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        return null;
    }
    public static void salvar(Administradora adm) {
        Connection conexao = DAO.abriConexao();
        String sql ="insert into administradora (nome,cnpj) values(?,?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, adm.getNome());
            ps.setString(2, adm.getCnpj());
            ps.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        
    }
    
}
