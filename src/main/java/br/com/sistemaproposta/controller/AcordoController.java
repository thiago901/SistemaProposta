/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.AcordoDAO;
import br.com.sistemaproposta.model.Acordo;
import br.com.sistemaproposta.model.Parcela;

/**
 *
 * @author Thiago
 */
public class AcordoController {

    public static void criarAcordo(Acordo a) {
        Acordo novoAcordo = AcordoDAO.criarAcordo(a);
        Parcela p = new Parcela(novoAcordo);
        p.criarParcelas();
    }
    
}
