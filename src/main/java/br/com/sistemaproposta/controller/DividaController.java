/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.DividaDAO;
import br.com.sistemaproposta.model.Divida;

/**
 *
 * @author Thiago
 */
public class DividaController {

    public static void salvar(Divida divida) {
        DividaDAO.salvar(divida);
    }

    public static Divida getDivida(int idDivida) {
        return DividaDAO.getDivida(idDivida);
    }
    
}
