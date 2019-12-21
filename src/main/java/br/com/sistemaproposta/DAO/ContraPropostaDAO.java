/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.controller.DividaController;
import br.com.sistemaproposta.controller.PropostaController;
import br.com.sistemaproposta.model.ContraProposta;
import br.com.sistemaproposta.model.Divida;
import br.com.sistemaproposta.model.Proposta;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Thiago
 */
public class ContraPropostaDAO {

    public static void salvar(ContraProposta p) {
        String sql="insert into Proposta (idDivida, vlrPrincipal, "
                                            + "vlrMultas, vlrJuros, vlrDespesas, "
                                            + "perc_HO, qtdParcelas, StatusPagamento, "
                                            + "StatusProposta, dtProposta, dtVencimento,idContraProposta)"
                + "Values(?,?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setInt(12, p.getProposta().getId());
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

    private static void criarParcelas(int chaveProposta, ContraProposta p) {
        
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

    public static ContraProposta getContraProposta(int idContraProposta) {
        String sql ="select * from proposta where id=?";
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            ps.setInt(1, idContraProposta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id =rs.getInt("id"); 
                int idDivida=rs.getInt("idDivida"); 
                float vlrPrincipal=rs.getFloat("vlrPrincipal"); 
                float vlrMultas=rs.getFloat("vlrMultas"); 
                float vlrJuros=rs.getFloat("vlrJuros"); 
                float vlrDespesas=rs.getFloat("vlrDespesas"); 
                float perc_HO=rs.getFloat("perc_HO"); 
                int qtdParcelas=rs.getInt("qtdParcelas"); 
                String tipoProposta=rs.getString("tipoProposta"); 
                String StatusPagamento=rs.getString("StatusPagamento"); 
                String StatusProposta=rs.getString("StatusProposta"); 
                Date dtProposta=rs.getDate("dtProposta"); 
                Date dtVencimento=rs.getDate("dtVencimento"); 
                int idProposta=rs.getInt("idContraProposta"); 
                
                Divida divida = DividaController.getDivida(idDivida);
                Proposta proposta = PropostaController.getProposta(idProposta);
                
                return new ContraProposta(id, divida, vlrPrincipal, vlrMultas, vlrJuros,
                        vlrDespesas, perc_HO, qtdParcelas, tipoProposta, 
                        StatusPagamento, StatusProposta, dtProposta, dtVencimento,proposta);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        return null;
    }
    
}
