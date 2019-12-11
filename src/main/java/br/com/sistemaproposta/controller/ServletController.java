/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.ReflexaoController.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
@WebServlet(name = "ServletController", urlPatterns = {"/input"})
public class ServletController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String action = req.getParameter("action");
        String pacote = "br.com.sistemaproposta.action.";

         new Reflexao()
                .refleteClasse(pacote+action)
                .criaInstancia()
                .getMetodo("execute",HttpServletRequest.class,HttpServletResponse.class)
                .invoca(req,resp);
        
        
        
        
        
        
        
        
    }
    

}
