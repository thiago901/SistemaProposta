/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.UsuarioDAO;
import br.com.sistemaproposta.model.Usuario;


/**
 *
 * @author Thiago Santos Rocha
 */

public class UsuarioController {

       public static Usuario validaUsuario(int id){
        return UsuarioDAO.validaUsuario(id);
    }

    public static Usuario validaUsuario(String login, String senha) {
        return UsuarioDAO.validaUsuario(login,senha);
    }
    
}
