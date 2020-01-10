/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.action;

import br.com.sistemaproposta.controller.MensagemController;
import br.com.sistemaproposta.controller.PropostaController;
import br.com.sistemaproposta.controller.UsuarioController;
import br.com.sistemaproposta.model.Mensagem;
import br.com.sistemaproposta.model.Proposta;
import br.com.sistemaproposta.model.Usuario;
import br.com.sistemaproposta.utilInterface.Executavel;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Thiago
 */
public class Login implements Executavel{
    

    
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");
        
        Usuario usr = UsuarioController.validaUsuario(login,senha);
        HttpSession session = req.getSession();
        session.setAttribute("usr", usr);
        return "redirect:/SistemaProposta/input?action=FormPropostaLista";
    }
}
