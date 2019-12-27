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
public class PropostaAprovado implements StatusProposta{

    @Override
    public void aprovar(Proposta p) {
        throw new RuntimeException("Proposta já está aprovada");
    }

    @Override
    public void rejeitar(Proposta p) {
        throw new RuntimeException("Proposta aprovada não pode ser rejeitada");
    }

    @Override
    public void contraProposta(Proposta p) {
        throw new RuntimeException("Proposta aprovada não é possivel criar uma contra proposta");
    }

    @Override
    public void pendente(Proposta p) {
        throw new RuntimeException("Proposta já está aprovada");
    }

    @Override
    public void cancelar(Proposta p) {
        p.setStatusProposta(new PropostaCancelado());
    }

    @Override
    public String getStatusProposta() {
        return "Aprovado";
    }
    
    
}
