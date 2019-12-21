/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.ContraPropostaDAO;
import br.com.sistemaproposta.model.ContraProposta;



/**
 *
 * @author Thiago
 */
public class ContraPropostaController {

    public static void salvar(ContraProposta p) {
        ContraPropostaDAO.salvar(p);
    }

    public static ContraProposta getProposta(int idContraProposta) {
        return ContraPropostaDAO.getContraProposta(idContraProposta);
    }
    
}
