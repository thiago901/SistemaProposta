/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.controller.ContratoController;
import br.com.sistemaproposta.model.Contrato;
import br.com.sistemaproposta.model.Divida;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago
 */
public class DividaDAO {

    public static void salvar(Divida d) {
        String sql="insert into divida (numContrato, vlrPrincipal, vlrMultas, "
                +                       "vlrJuros, vlrDespesas, perc_HO, "
                +                       "vlrCategoria, perc_SaldoDevedor, vlrPOS, "
                +                       "vlrDebitoBem, dtAtraso, dtAtualizacao) "
                + "Values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            ps.setString(1, d.getContrato().getNumContrato());
            ps.setFloat(2, d.getVlrPrincipal());
            ps.setFloat(3, d.getVlrMultas());
            
            ps.setFloat(4, d.getVlrJuros());
            ps.setFloat(5, d.getVlrDespesas());
            ps.setFloat(6, d.getPercHonorarios());
            
            ps.setFloat(7, d.getVlrCategoria());
            ps.setFloat(8, d.getPercSaldoDevedor());
            ps.setFloat(9, d.getVlrPos());
            
            ps.setFloat(10, d.getVlrDebitoBem());
            ps.setDate(11, new Date(d.getDtAtraso().getTime()));
            ps.setDate(12, new Date(d.getDtAtualizacao().getTime()));
            ps.execute();
            
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
    }

    public static Divida getDivida(int idDivida) {
        String sql="select * from divida where id=?";
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            ps.setInt(1, idDivida);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id =rs.getInt("id");
                String numContrato = rs.getString("numContrato");
                float vlrPrincipal= rs.getFloat("vlrPrincipal");
                float vlrMultas= rs.getFloat("vlrMultas");
                float vlrJuros= rs.getFloat("vlrJuros");
                float vlrDespesas= rs.getFloat("vlrDespesas");
                float perc_HO= rs.getFloat("perc_HO");
                float vlrCategoria= rs.getFloat("vlrCategoria");
                float perc_SaldoDevedor= rs.getFloat("perc_SaldoDevedor");
                float vlrPOS= rs.getFloat("vlrPOS");
                float vlrDebitoBem= rs.getFloat("vlrDebitoBem");
                Date dtAtraso=rs.getDate("dtAtraso"); 
                Date dtAtualizacao= rs.getDate("dtAtualizacao");
                
                Contrato c = ContratoController.getContrato(numContrato);
                return new Divida(idDivida, c, vlrPrincipal, 
                        vlrMultas, vlrJuros, vlrDespesas, 
                        perc_HO, vlrCategoria, perc_SaldoDevedor, 
                        vlrPOS, vlrDebitoBem, dtAtraso,dtAtualizacao);
                
                
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        return null;
    }

}
