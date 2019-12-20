/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.PropostaDAO;
import br.com.sistemaproposta.model.Proposta;

/**
 *
 * @author Thiago
 */
public class PropostaController {

    public static void salvar(Proposta p) {
        PropostaDAO.salvar(p);
    }
    
}
