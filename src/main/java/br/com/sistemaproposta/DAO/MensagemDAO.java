/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.DAO;

import br.com.sistemaproposta.model.Mensagem;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class MensagemDAO {

    public static void salvar(Mensagem m) {

        Connection conexao = DAO.abriConexao();
        String sql = "insert into conversa (idProposta, conversa, dataConversa) values (?,?,?);";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, m.getIdProposta());
            ps.setString(2, m.getConvesa());
            ps.setDate(3, new Date(m.getDtConversa().getTime()));
            
            ps.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe", ex);
        } finally {
            DAO.fecharConexao();
        }
    }

    public static List<Mensagem> getMensagem(int idProposta) {
        Connection conexao = DAO.abriConexao();
        String sql = "select * from conversa where idProposta=?";
        try {
            List<Mensagem> lista = new ArrayList<>();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idProposta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idConversa=rs.getInt("idConversa") ; 
                String conversa=rs.getString("conversa");
                Date dataConversa=rs.getDate("dataConversa");
                
                
                lista.add(new Mensagem(idConversa, idProposta, conversa, dataConversa));
            }
            return lista;
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de sintaxe", ex);
        } finally {
            DAO.fecharConexao();
        }
    }
}
