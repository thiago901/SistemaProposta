/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.ContratoDAO;
import br.com.sistemaproposta.model.Contrato;

/**
 *
 * @author Thiago
 */
public class ContratoController {

    public static void salvar(Contrato contrato) {
        ContratoDAO.salvar(contrato);
    }
    
}
