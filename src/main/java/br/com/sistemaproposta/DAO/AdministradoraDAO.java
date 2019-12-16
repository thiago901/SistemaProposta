/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.model.Administradora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago
 */
public class AdministradoraDAO {

    public static void salvar(Administradora adm) {
        Connection conexao = DAO.abriConexao();
        String sql ="insert into administradora (nome,cnpj) values(?,?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, adm.getNome());
            ps.setString(2, adm.getCnpj());
            ps.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe",ex);
        }
        
        DAO.fecharConexao();
        
    }
    
}
