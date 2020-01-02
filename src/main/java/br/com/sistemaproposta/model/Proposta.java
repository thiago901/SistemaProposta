/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.model;

import br.com.sistemaproposta.controller.PropostaController;
import br.com.sistemaproposta.utilInterface.StatusProposta;
import br.com.sistemaproposta.utilmodel.PropostaPendente;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Thiago
 */
public class Proposta {

    private int id;
    private Divida divida;
    private float vlrPrincipal;
    private float vlrMultas;
    private float vlrJuros;
    private float vlrDespesas;
    private float percHO;
    private int qtdParcela;
    private String tipoProsposta;
    private StatusProposta statusProposta;
    private Date dtProposta;
    

    public Proposta(int id, Divida divida, float vlrPrincipal, float vlrMultas, float vlrJuros, float vlrDespesas, float percHO, int qtdParcela, String tipoProsposta, StatusProposta statusProposta, Date dtProposta) {
        this.id = id;
        this.divida = divida;
        this.vlrPrincipal = vlrPrincipal;
        this.vlrMultas = vlrMultas;
        this.vlrJuros = vlrJuros;
        this.vlrDespesas = vlrDespesas;
        this.percHO = percHO;
        this.qtdParcela = qtdParcela;
        this.tipoProsposta = tipoProsposta;
        this.statusProposta = statusProposta;
        this.dtProposta = dtProposta;
    }

    public Proposta(Divida divida, float vlrPrincipal, float vlrMultas, float vlrJuros, float vlrDespesas, float percHO, int qtdParcela, String tipoProsposta) {
        this.divida = divida;
        this.vlrPrincipal = vlrPrincipal;
        this.vlrMultas = vlrMultas;
        this.vlrJuros = vlrJuros;
        this.vlrDespesas = vlrDespesas;
        this.percHO = percHO;
        this.qtdParcela = qtdParcela;
        this.tipoProsposta = tipoProsposta;
        this.statusProposta = new PropostaPendente();
        this.dtProposta = Calendar.getInstance().getTime();
    }

    public int getId() {
        return id;
    }

    public Divida getDivida() {
        return divida;
    }

    public void setDivida(Divida divida) {
        this.divida = divida;
    }

    public float getVlrPrincipal() {
        return vlrPrincipal;
    }

    public void setVlrPrincipal(float vlrPrincipal) {
        this.vlrPrincipal = vlrPrincipal;
    }

    public float getVlrMultas() {
        return vlrMultas;
    }

    public void setVlrMultas(float vlrMultas) {
        this.vlrMultas = vlrMultas;
    }

    public float getVlrJuros() {
        return vlrJuros;
    }

    public void setVlrJuros(float vlrJuros) {
        this.vlrJuros = vlrJuros;
    }

    public float getVlrDespesas() {
        return vlrDespesas;
    }

    public void setVlrDespesas(float vlrDespesas) {
        this.vlrDespesas = vlrDespesas;
    }

    public float getPercHO() {
        return percHO;
    }

    public void setPercHO(float percHO) {
        this.percHO = percHO;
    }

    public int getQtdParcela() {
        return qtdParcela;
    }

    public void setQtdParcela(int qtdParcela) {
        this.qtdParcela = qtdParcela;
    }

    public String getTipoProsposta() {
        return tipoProsposta;
    }

    public void setTipoProsposta(String tipoProsposta) {
        this.tipoProsposta = tipoProsposta;
    }

    public StatusProposta getStatusProposta() {
        return statusProposta;
    }

    public void setStatusProposta(StatusProposta statusProposta) {
        this.statusProposta = statusProposta;
    }

    public Date getDtProposta() {
        return dtProposta;
    }

    public void salvar() {
        PropostaController.salvar(this);
    }

    public void aprova() {
        this.statusProposta.aprovar(this);
    }

    public void cancela() {
        this.statusProposta.cancelar(this);
    }

    public void contraProposta() {
        this.statusProposta.contraProposta(this);
    }

    public void pendente() {
        this.statusProposta.pendente(this);
    }

    public void rejeitarProposta() {
        this.statusProposta.rejeitar(this);
        PropostaController.alterarStatus(this);
    }

}
