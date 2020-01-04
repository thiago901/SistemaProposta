/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.ParcelaDAO;
import br.com.sistemaproposta.model.Parcela;

/**
 *
 * @author Thiago
 */
public class ParcelaController {
    public static void criarParcelas(Parcela p){
        ParcelaDAO.criarParcelas(p);
    }
}
