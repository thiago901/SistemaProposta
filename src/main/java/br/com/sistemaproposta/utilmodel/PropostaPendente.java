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
public class PropostaPendente implements StatusProposta{

    @Override
    public void pendente(Proposta p) {
        throw new RuntimeException("Proposta já está pendente");
    }

    @Override
    public void aprovar(Proposta p) {
        p.setStatusProposta(new PropostaAprovada());
    }

    @Override
    public void rejeitar(Proposta p) {
        p.setStatusProposta(new PropostaRejeitada());
    }

    @Override
    public void contraProposta(Proposta p) {
        p.setStatusProposta(new PropostaContra());
    }

    @Override
    public void cancelar(Proposta p) {
        throw new RuntimeException("Proposta não pode ser cancelada");
    }
    
}
