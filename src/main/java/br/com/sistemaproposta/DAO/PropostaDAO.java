/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

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
public class PropostaDAO {

    public static void salvar(Proposta p) {
        String sql="insert into proposta (idDivida, vlrPrincipal, "
                                            + "vlrMultas, vlrJuros, vlrDespesas, "
                                            + "perc_HO, qtdParcelas, StatusPagamento, "
                                            + "StatusProposta, dtProposta, dtVencimento)"
                + "Values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p.getDivida().getNumDivida());
            ps.setFloat(2, p.getVlrPrincipal());
            ps.setFloat(3, p.getVlrMultas());
            ps.setFloat(4, p.getVlrJuros());
            ps.setFloat(5, p.getVlrDespesas());
            ps.setFloat(6, p.getPercHO());
            ps.setInt(7, p.getQtdParcela());
            ps.setString(8, p.getStatusPagamento());
            ps.setString(9, p.getStatusProposta());
            ps.setDate(10, new Date(p.getDtProposta().getTime()));
            ps.setDate(11, new Date(p.getDtVencimento().getTime()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            while(rs.next()){
                int chaveProposta = rs.getInt(1);
                criarParcelas(chaveProposta,p);
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
    }

    private static void criarParcelas(int chaveProposta, Proposta p) {
        
        String sql="insert into parcela (idProposta,nParcela,vlrApagar,dtVencimento,dtPagamento,statusPagamento) "
                    + "Values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            int qtdParcelas = p.getQtdParcela();
            for(int i=1;i<=qtdParcelas;i++){
                ps.setInt(1, chaveProposta);
                ps.setInt(2, i);
                ps.setFloat(3, p.getVlrPrincipal()/qtdParcelas);
                ps.setDate(4, new Date(p.getDtVencimento().getTime()));
                ps.setDate(5, null);
                ps.setString(6, "PENDENTE");
                ps.execute();
            }
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        
    }
    
}
