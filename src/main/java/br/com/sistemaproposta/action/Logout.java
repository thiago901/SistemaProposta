/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.action;

import br.com.sistemaproposta.controller.UsuarioController;
import br.com.sistemaproposta.model.Usuario;
import br.com.sistemaproposta.utilInterface.Executavel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Thiago
 */
public class Logout implements Executavel{
    

    
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        HttpSession session = req.getSession();
        
        session.invalidate();
        return "redirect:/SistemaProposta/input?action=FormPropostaLista";
    }
}
