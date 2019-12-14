/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.action;

import br.com.sistemaproposta.model.Cidade;
import br.com.sistemaproposta.model.Cliente;
import br.com.sistemaproposta.model.Estado;
import br.com.sistemaproposta.util.Executavel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class CadastrarCliente implements Executavel{
    
    
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nomeCliente");
        String cpf_Cnpj = req.getParameter("cnpj-cpf");
        int uf = Integer.parseInt(req.getParameter("uf"));
        int cidade = Integer.parseInt(req.getParameter("cidade"));
        
        
        Cidade cid = new Cidade(cidade, new Estado(uf));
        Cliente c = new Cliente(nome, cpf_Cnpj, cid);
        c.salvar();
        return "redirect:"+req.getContextPath()+"/input?action=FormCliente";
    }
}
