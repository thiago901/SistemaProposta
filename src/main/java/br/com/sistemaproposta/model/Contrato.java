/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.model;

import br.com.sistemaproposta.controller.ContratoController;

/**
 *
 * @author Thiago
 */
public class Contrato {
    String contrato;
    Cliente c;
    Assessoria asse;

    public Contrato(String contrato, Cliente c, Assessoria asse) {
        this.contrato = contrato;
        this.c = c;
        this.asse = asse;
    }

    public String getContrato() {
        return contrato;
    }

    public Cliente getCliente() {
        return c;
    }

    public void setCliente(Cliente c) {
        this.c = c;
    }

    public Assessoria getAssessoria() {
        return asse;
    }

    public void setAssessoria(Assessoria asse) {
        this.asse = asse;
    }
    
    public void salvar() {
        ContratoController.salvar(this);
    }
    
}
