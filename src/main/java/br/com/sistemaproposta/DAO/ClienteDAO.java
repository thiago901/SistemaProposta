/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
        }

        DAO.fecharConexao();
    }
        
    
}
