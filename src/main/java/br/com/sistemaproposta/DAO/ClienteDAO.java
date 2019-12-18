/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.controller.CidadeController;
import br.com.sistemaproposta.model.Cidade;
import br.com.sistemaproposta.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thiago
 */
public class ClienteDAO {

    public static void salvar(Cliente c){
        Connection conexao = DAO.abriConexao();
        String sql="insert into cliente (nome, cnpj_cpf, idUf, idCidade) values (?,?,?,?);";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCpf_Cnpj());
            ps.setInt(3, c.getCidade().getEstado().getId());
            ps.setInt(4, c.getCidade().getId());
            ps.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
    }

    public static Cliente getCliente(int codCliente) {
        
        
        String sql ="select * from cliente where id = ?;";
        Cliente cliente =null;
        try {
            PreparedStatement ps = DAO.abriConexao().prepareStatement(sql);
            ps.setInt(1, codCliente);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cnpj_cpf = rs.getString("cnpj_cpf");
                int idCidade = rs.getInt("idCidade");
                
                Cidade cid = CidadeController.getCidade(idCidade);
                cliente= new Cliente(id, nome, cnpj_cpf,cid);
                
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }finally{
            DAO.fecharConexao();
        }
        
        return cliente;
    
    }
        
    
}
