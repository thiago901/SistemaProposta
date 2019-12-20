/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.model;

import java.util.Date;

/**
 *
 * @author Thiago
 */
public class Parcela {
    
    int idProposta;
    int numParcela;
    float vlrApagar;
    Date dtVencimento;
    Date DtPagamento;
    String statusPagamento;

    public int getIdProposta() {
        return idProposta;
    }

    public void setIdProposta(int idProposta) {
        this.idProposta = idProposta;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }

    public float getVlrApagar() {
        return vlrApagar;
    }

    public void setVlrApagar(float vlrApagar) {
        this.vlrApagar = vlrApagar;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Date getDtPagamento() {
        return DtPagamento;
    }

    public void setDtPagamento(Date DtPagamento) {
        this.DtPagamento = DtPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
    

    
    
}
