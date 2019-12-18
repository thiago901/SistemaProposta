/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.controller.EstadoController;
import br.com.sistemaproposta.model.Cidade;
import br.com.sistemaproposta.model.Estado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thiago
 */
public class CidadeDAO {

    public static Cidade getCidade(int codCidade) {
        String sql ="select * from cidade where id = ?;";
        Cidade cid = null;
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            ps.setInt(1, codCidade);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                int id = rs.getInt("id");
                String nomeCidade = rs.getString("nomeCidade");
                int idUf = rs.getInt("idUf");
                
                Estado estado = EstadoController.getEstado(idUf);
                cid= new Cidade(id,nomeCidade, estado);
                 
                
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        return cid;
    }
    
}
