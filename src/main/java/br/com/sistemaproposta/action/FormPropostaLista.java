/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.action;

import br.com.sistemaproposta.controller.PropostaController;
import br.com.sistemaproposta.model.Proposta;
import br.com.sistemaproposta.utilInterface.Executavel;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class FormPropostaLista implements Executavel{
    

    
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Proposta> listaProposta = PropostaController.getPropostas();
        req.setAttribute("lista", listaProposta);
        return "dispatcher:"+"/WEB-INF/jsp/proposta/form-proposta-lista.jsp";
    }
}
