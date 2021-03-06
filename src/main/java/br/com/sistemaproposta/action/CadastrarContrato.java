/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.action;

import br.com.sistemaproposta.DAO.AdministradoraDAO;
import br.com.sistemaproposta.controller.AdministradoraController;
import br.com.sistemaproposta.controller.AssessoriaController;
import br.com.sistemaproposta.controller.ClienteController;
import br.com.sistemaproposta.model.Administradora;
import br.com.sistemaproposta.model.Assessoria;
import br.com.sistemaproposta.model.Cliente;
import br.com.sistemaproposta.model.Contrato;
import br.com.sistemaproposta.utilInterface.Executavel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class CadastrarContrato implements Executavel{
    
    
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String numContrato = req.getParameter("contrato");
        int codCliente = Integer.parseInt(req.getParameter("cod-cliente"));
        int codAssessoria = Integer.parseInt(req.getParameter("cod-assessoria"));
        int codAdministradora = Integer.parseInt(req.getParameter("cod-administradora"));
        
        
        Assessoria assessoria = AssessoriaController.getAssessoria(codAssessoria);
        Cliente cliente = ClienteController.getCliente(codCliente);
        Administradora adm  = AdministradoraController.getAdministradora(codAdministradora);
        Contrato contrato = new Contrato(numContrato, cliente, assessoria,adm);
        contrato.salvar();
        
        
        
        
        return "redirect:"+req.getContextPath()+"/input?action=FormContrato";
    }
}
