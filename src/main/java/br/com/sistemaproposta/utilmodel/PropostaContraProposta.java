/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.utilmodel;

import br.com.sistemaproposta.model.Proposta;
import br.com.sistemaproposta.utilInterface.StatusProposta;

/**
 *
 * @author Thiago
 */
public class PropostaContraProposta implements StatusProposta{

    @Override
    public void aprovar(Proposta p) {
        throw new RuntimeException("Favor analisar contra proposta, está proposta não será alterada");
    }

    @Override
    public void rejeitar(Proposta p) {
        throw new RuntimeException("Favor analisar contra proposta, está proposta não será alterada");
    }

    @Override
    public void contraProposta(Proposta p) {
        throw new RuntimeException("Favor analisar contra proposta, está proposta não será alterada");
    }

    @Override
    public void pendente(Proposta p) {
        throw new RuntimeException("Favor analisar contra proposta, está proposta não será alterada");
    }

    @Override
    public void cancelar(Proposta p) {
        throw new RuntimeException("Favor analisar contra proposta, está proposta não será alterada");
    }

    @Override
    public String getStatusProposta() {
        return "ContraProposta";
    }
    
}
