/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.action;

import br.com.sistemaproposta.controller.AdministradoraController;
import br.com.sistemaproposta.model.Administradora;
import br.com.sistemaproposta.model.Assessoria;
import br.com.sistemaproposta.utilInterface.Executavel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class CadastrarAssessoria implements Executavel{
    
    
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nomeAssessoria");
        String cnpj = req.getParameter("cnpj");
        int codAdministradora = Integer.parseInt(req.getParameter("cod-administradora"));
        
        
        Administradora administradora = AdministradoraController.getAdministradora(codAdministradora);
        if(administradora==null){
            throw new RuntimeException("Assessoria não pode ser cadastrada sem uma Administradora vinculada");
        }
        
        Assessoria ass = new Assessoria(nome, cnpj);
        ass.adicionaAdministradoras(administradora);
        ass.salvar();
        return "redirect:"+req.getContextPath()+"/input?action=FormAssessoria";
    }
}
