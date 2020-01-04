/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.controller.PropostaController;
import br.com.sistemaproposta.model.Acordo;
import br.com.sistemaproposta.model.Proposta;
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
public class AcordoDAO {

    public static Acordo criarAcordo(Acordo a) {
        String sql="insert into acordo (idProposta, dtAcordo, dtVencimento, status) "
                                    + "values(?,?,?,?);";
        try {
            PreparedStatement ps =  DAO.abriConexao().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, a.getProposta().getId());
            ps.setDate(2, new Date(a.getDtAcordo().getTime()));
            ps.setDate(3, new Date(a.getDtVencimento().getTime()));
            ps.setString(4, a.getStatusProposta().getStatusProposta());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while(rs.next()){
                int chave = rs.getInt(1);
                return new Acordo(chave, a.getProposta(), a.getDtAcordo(), a.getDtVencimento(), a.getStatusProposta());
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        return null;
    }

    public static Acordo getAcordo(int id) {
        String sql="select * from acordo where id=?;";
        try {
            PreparedStatement ps =  DAO.abriConexao().prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int idProposta = rs.getInt("idProposta");
                Date dtAcordo=rs.getDate("dtAcordo"); 
                Date dtVencimento=rs.getDate("dtVencimento");
                String status=rs.getString("status");
                
                Proposta p = PropostaController.getProposta(idProposta);
                return new Acordo(id, p, dtAcordo, dtVencimento, null);
  
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        return null;
    }
}
