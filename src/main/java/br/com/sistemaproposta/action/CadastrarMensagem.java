/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.action;

import br.com.sistemaproposta.model.Mensagem;
import br.com.sistemaproposta.utilInterface.Executavel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class CadastrarMensagem implements Executavel{
    
    
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int idProposta = Integer.parseInt(req.getParameter("idProposta"));
        String mensagem = req.getParameter("texto");     
        
        Mensagem m = new Mensagem(idProposta, mensagem);
        m.salvar();
                
        return "redirect:"+req.getContextPath()+"/input?action=AnaliseProposta&idProposta="+idProposta;
    }
}
