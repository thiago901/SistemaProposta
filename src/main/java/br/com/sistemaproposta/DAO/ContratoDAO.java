/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.model.Contrato;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago
 */
public class ContratoDAO {

    public static void salvar(Contrato contrato) {
        
        String sql="insert into contrato (numContrato, idCliente, idAssessoria) values (?,?,?);";
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            ps.setString(1, contrato.getContrato());
            ps.setInt(2, contrato.getCliente().getId());
            ps.setInt(3, contrato.getAssessoria().getId());
            ps.execute();
           
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
    }
    
    
}
