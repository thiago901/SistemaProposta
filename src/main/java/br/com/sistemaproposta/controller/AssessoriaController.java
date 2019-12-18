/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.controller;

import br.com.sistemaproposta.DAO.AssessoriaDAO;
import br.com.sistemaproposta.model.Assessoria;


public class AssessoriaController{

    public static void salvar(Assessoria ass) {
        AssessoriaDAO.salvar(ass);
    }

    public static Assessoria getAssessoria(int codAssessoria) {
        return AssessoriaDAO.getAssessoria(codAssessoria);
    }



    

}
