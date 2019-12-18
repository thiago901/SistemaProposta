/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.CidadeDAO;
import br.com.sistemaproposta.model.Cidade;

/**
 *
 * @author Thiago
 */
public class CidadeController {
    
    public static Cidade getCidade(int codCidade) {
        return CidadeDAO.getCidade(codCidade);
    }
    
}
