/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.EstadoDAO;
import br.com.sistemaproposta.model.Estado;

/**
 *
 * @author Thiago
 */
public class EstadoController {

    public static Estado getEstado(int idUf) {
        return EstadoDAO.getEstado(idUf);
    }
    
}
