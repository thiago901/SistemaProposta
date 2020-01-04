/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.model;

import br.com.sistemaproposta.controller.AcordoController;
import br.com.sistemaproposta.utilInterface.StatusProposta;
import br.com.sistemaproposta.utilmodel.PropostaPendente;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Thiago
 */
public class Acordo {
    int id;
    Proposta proposta;
    Date dtAcordo;
    Date dtVencimento;
    private StatusProposta statusProposta;

    public Acordo(Proposta p) {
        this.proposta = p;
        this.dtAcordo = Calendar.getInstance().getTime();
        this.dtVencimento = Calendar.getInstance().getTime();
        this.statusProposta = new PropostaPendente();
    }

    
    
    public Acordo(int id, Proposta p, Date dtAcordo, Date dtVencimento, StatusProposta statusProposta) {
        this.id = id;
        this.proposta = p;
        this.dtAcordo = dtAcordo;
        this.dtVencimento = dtVencimento;
        this.statusProposta = statusProposta;
    }

    public int getId() {
        return id;
    }


    public Proposta getProposta() {
        return proposta;
    }

    public void setProposta(Proposta p) {
        this.proposta = p;
    }

    public Date getDtAcordo() {
        return dtAcordo;
    }

    public void setDtAcordo(Date dtAcordo) {
        this.dtAcordo = dtAcordo;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public StatusProposta getStatusProposta() {
        return statusProposta;
    }

    public void setStatusProposta(StatusProposta statusProposta) {
        this.statusProposta = statusProposta;
    }

    void criarAcordo() {
        AcordoController.criarAcordo(this);
    }
    
    
    
    
    
}
