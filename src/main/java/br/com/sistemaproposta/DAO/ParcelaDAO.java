/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.model.Acordo;
import br.com.sistemaproposta.model.Parcela;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Thiago
 */
public class ParcelaDAO {

    public static void criarParcelas(Parcela p) {
        String sql="insert into parcela (idAcordo, nParcela, vlrApagar, dtPagamento, dtVencimento, statusPagamento) "
                                    + "values(?,?,?,?,?,?);";
        try {
            PreparedStatement ps =  DAO.abriConexao().prepareStatement(sql);
            int qtdParcela =p.getAcordo().getProposta().getQtdParcela();
            float vlrPrincipal = p.getAcordo().getProposta().getVlrPrincipal();
            
            for(int i =1;i<=qtdParcela;i++){
                ps.setInt(1, p.getAcordo().getId());
                ps.setInt(2, i);
                ps.setFloat(3,vlrPrincipal/ qtdParcela);
                ps.setDate(4, new Date(p.getAcordo().getProposta().getDtProposta().getTime()));
                ps.setDate(5, new Date(p.getAcordo().getProposta().getDtProposta().getTime()));
                ps.setString(6, p.getAcordo().getProposta().getStatusProposta().getStatusProposta());
                ps.execute();
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        
    }
    
}
