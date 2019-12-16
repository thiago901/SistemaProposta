/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.action;

import br.com.sistemaproposta.model.Administradora;
import br.com.sistemaproposta.util.Executavel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class CadastrarAdministradora implements Executavel{
    
    
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nomeAdministradora");
        String cnpj = req.getParameter("cnpj");
        
        
        
        
        Administradora adm = new Administradora(nome, cnpj);
        adm.salvar();
        return "redirect:"+req.getContextPath()+"/input?action=FormCliente";
    }
}
