/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.AdministradoraDAO;
import br.com.sistemaproposta.model.Administradora;

/**
 *
 * @author Thiago Santos Rocha
 */

public class AdministradoraController {

    public static void salvar(Administradora adm){
        AdministradoraDAO.salvar(adm);
        
        
    }

    
}
