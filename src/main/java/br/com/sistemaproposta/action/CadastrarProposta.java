/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.action;

import br.com.sistemaproposta.controller.DividaController;
import br.com.sistemaproposta.model.Divida;
import br.com.sistemaproposta.model.Proposta;
import br.com.sistemaproposta.utilInterface.Executavel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class CadastrarProposta implements Executavel{
    
    
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int idDivida = Integer.parseInt(req.getParameter("idDivida"));
        float vlrPrincipal = Float.parseFloat(req.getParameter("principal"));
        float vlrMultas = Float.parseFloat(req.getParameter("multas"));
        float vlrJuros = Float.parseFloat(req.getParameter("juros"));
        float vlrDespesas = Float.parseFloat(req.getParameter("despesas"));
        float percHonorarios = Float.parseFloat(req.getParameter("perc-honorarios"));
        String tipoProposta = req.getParameter("tipo-proposta");
        int qtdParcela = Integer.parseInt(req.getParameter("qtd-parcela"));

       
        
        
        Divida divida = DividaController.getDivida(idDivida);
        if(divida==null){
            throw new RuntimeException("Assessoria não pode ser cadastrada sem uma Administradora vinculada");
        }
        
        Proposta proposta = new Proposta(divida, vlrPrincipal, vlrMultas,
                                            vlrJuros, vlrDespesas, percHonorarios, 
                                            qtdParcela, tipoProposta);
        
        proposta.salvar();
                
        return "redirect:"+req.getContextPath()+"/input?action=FormProposta";
    }
}
