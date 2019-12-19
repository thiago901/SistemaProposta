/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.model.Divida;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

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

}
