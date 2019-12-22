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
    Administradora adm;

    public Contrato(String contrato, Cliente c, Assessoria asse,Administradora adm) {
        this.contrato = contrato;
        this.c = c;
        this.asse = asse;
        this.adm = adm;
    }

    public String getNumContrato() {
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

    public Administradora getAdministradora() {
        return adm;
    }

    public void setAdministradora(Administradora adm) {
        this.adm = adm;
    }
    
    public void salvar() {
        ContratoController.salvar(this);
    }
    
}
