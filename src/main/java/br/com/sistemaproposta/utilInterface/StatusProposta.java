/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.utilInterface;

import br.com.sistemaproposta.model.Proposta;

/**
 *
 * @author Thiago
 */
public interface StatusProposta {
    void pendente(Proposta p);
    void aprovar(Proposta p);
    void rejeitar(Proposta p);
    void contraProposta(Proposta p);
    void cancelar(Proposta p);
    String getStatusProposta();
}
