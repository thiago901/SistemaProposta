/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.controller.AdministradoraController;
import br.com.sistemaproposta.controller.AssessoriaController;
import br.com.sistemaproposta.controller.ClienteController;
import br.com.sistemaproposta.model.Administradora;
import br.com.sistemaproposta.model.Assessoria;
import br.com.sistemaproposta.model.Cliente;
import br.com.sistemaproposta.model.Contrato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thiago
 */
public class ContratoDAO {

    public static void salvar(Contrato contrato) {
        
        String sql="insert into contrato (numContrato, idCliente, idAssessoria,idAdministradora) values (?,?,?,?);";
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            ps.setString(1, contrato.getNumContrato());
            ps.setInt(2, contrato.getCliente().getId());
            ps.setInt(3, contrato.getAssessoria().getId());
            ps.setInt(4, contrato.getAdministradora().getId());
            ps.execute();
           
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
    }

    public static Contrato getContrato(String numContrato) {
        String sql="select * from contrato where numContrato = ?";
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            ps.setString(1, numContrato);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int idCliente = rs.getInt("idCliente");
                int idAssessoria = rs.getInt("idAssessoria");
                int idAdministradora = rs.getInt("idAdministradora");
                Cliente cliente = ClienteController.getCliente(idCliente);
                Assessoria assessoria = AssessoriaController.getAssessoria(idAssessoria);
                Administradora adm = AdministradoraController.getAdministradora(idAdministradora);

                return new Contrato(numContrato, cliente, assessoria,adm);
                
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        return null;
    }
    
    
}
