/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.ClienteDAO;
import br.com.sistemaproposta.model.Cliente;

/**
 *
 * @author Thiago
 */
public class ClienteController {
    public static void salvar(Cliente c){
        ClienteDAO.salvar(c);
        
    }

    public static Cliente getCliente(int codCliente) {
        return ClienteDAO.getCliente(codCliente);
    }
    
}
