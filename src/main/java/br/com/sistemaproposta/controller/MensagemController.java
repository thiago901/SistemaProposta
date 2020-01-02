/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.MensagemDAO;
import br.com.sistemaproposta.model.Mensagem;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class MensagemController {

    public static void salvar(Mensagem m) {
        MensagemDAO.salvar(m);
    }

    public static List<Mensagem> getMensagem(int idProposta) {
        return MensagemDAO.getMensagem(idProposta);
    }
    
}
