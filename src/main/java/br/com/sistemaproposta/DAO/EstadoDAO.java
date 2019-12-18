/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.model.Estado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thiago
 */
public class EstadoDAO {

    public static Estado getEstado(int idUf) {
        String sql ="select * from uf where id = ?;";
        Estado e = null;
        try {
            
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            ps.setInt(1, idUf);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                                
                int id = rs.getInt("id");
                String uf = rs.getString("uf");
                String estado = rs.getString("estado");
                String capital = rs.getString("capital");
                String regiao = rs.getString("regiao");
                String pais = rs.getString("pais");
                e= new Estado(id, uf,estado, capital, regiao, pais);
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        return e;
    }
    
}
