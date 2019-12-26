/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.action;

import br.com.sistemaproposta.controller.ContratoController;
import br.com.sistemaproposta.model.Contrato;
import br.com.sistemaproposta.model.Divida;
import br.com.sistemaproposta.utilInterface.Executavel;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class CadastrarDivida implements Executavel{
    
    
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String numContrato = req.getParameter("num-contrato");
        float vlrPrincipal = Float.parseFloat(req.getParameter("principal"));
        float vlrMultas = Float.parseFloat(req.getParameter("multas"));
        float vlrJuros = Float.parseFloat(req.getParameter("juros"));
        float vlrDespesas = Float.parseFloat(req.getParameter("despesas"));
        float percHonorarios = Float.parseFloat(req.getParameter("perc-honorarios"));
        float vlrCategoria = Float.parseFloat(req.getParameter("categoria"));
        float percSaldoDev = Float.parseFloat(req.getParameter("perc-saldo-devedor"));
        float vlrPOS = Float.parseFloat(req.getParameter("POS"));
        float vlrDebBem = Float.parseFloat(req.getParameter("debitos-bem"));
        String dtAtrasoStr =req.getParameter("dt-atraso");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dtAtraso;
        
        try {
            dtAtraso = sdf.parse(dtAtrasoStr);
        } catch (ParseException ex) {
            throw new RuntimeException("Data não pode ser convertida", ex);
        }
        
        Contrato contrato = ContratoController.getContrato(numContrato);
        if(contrato==null){
            throw new RuntimeException("Assessoria não pode ser cadastrada sem uma Administradora vinculada");
        }
        
        Divida divida = new Divida(contrato, vlrPrincipal, vlrMultas, 
                                    vlrJuros, vlrDespesas, percHonorarios, 
                                    vlrCategoria, percSaldoDev, vlrPOS, 
                                    vlrDebBem, dtAtraso);
        divida.salvar();
        return "redirect:"+req.getContextPath()+"/input?action=FormDivida";
    }
}
