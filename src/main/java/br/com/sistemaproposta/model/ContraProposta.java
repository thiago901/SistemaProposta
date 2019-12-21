/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.model;

import br.com.sistemaproposta.controller.ContraPropostaController;
import br.com.sistemaproposta.controller.PropostaController;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class ContraProposta {
    
    private int id;
    private Divida divida;
    private float vlrPrincipal;
    private float vlrMultas;
    private float vlrJuros;
    private float vlrDespesas;
    private float percHO;
    private int qtdParcela;
    private List<Parcela> parcelas =new ArrayList<>();
    private String tipoProsposta;
    private String statusPagamento;
    private String statusProposta;
    private Date dtProposta;
    private Date dtVencimento;
    private Proposta proposta;

    public ContraProposta(int id, Divida divida, float vlrPrincipal, 
            float vlrMultas, float vlrJuros, float vlrDespesas, float percHO, 
            int qtdParcela, String tipoProsposta, String statusPagamento, 
            String statusProposta, Date dtProposta, Date dtVencimento,Proposta proposta) {
        this.id = id;
        this.divida = divida;
        this.vlrPrincipal = vlrPrincipal;
        this.vlrMultas = vlrMultas;
        this.vlrJuros = vlrJuros;
        this.vlrDespesas = vlrDespesas;
        this.percHO = percHO;
        this.qtdParcela = qtdParcela;
        this.tipoProsposta = tipoProsposta;
        this.statusPagamento = statusPagamento;
        this.statusProposta = statusProposta;
        this.dtProposta = dtProposta;
        this.dtVencimento = dtVencimento;
        this.proposta = proposta;
    }
    
    public ContraProposta(Divida divida, float vlrPrincipal, float vlrMultas, 
            float vlrJuros, float vlrDespesas, float percHO, int qtdParcela, 
            String tipoProsposta,Proposta proposta) {
        this.divida = divida;
        this.vlrPrincipal = vlrPrincipal;
        this.vlrMultas = vlrMultas;
        this.vlrJuros = vlrJuros;
        this.vlrDespesas = vlrDespesas;
        this.percHO = percHO;
        this.qtdParcela = qtdParcela;
        this.tipoProsposta = tipoProsposta;
        this.statusPagamento = "Aberto";
        this.statusProposta = "Pendente";
        this.dtProposta = Calendar.getInstance().getTime();
        this.dtVencimento = this.dtProposta;
        this.proposta = proposta;
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

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getStatusProposta() {
        return statusProposta;
    }

    public void setStatusProposta(String statusProposta) {
        this.statusProposta = statusProposta;
    }

    public Date getDtProposta() {
        return dtProposta;
    }

    public Proposta getProposta() {
        return proposta;
    }

    public void setProposta(Proposta proposta) {
        this.proposta = proposta;
    }


    public Date getDtVencimento() {
        return dtVencimento;
    }
    
    public void salvar(){
        ContraPropostaController.salvar(this);
    }
    
   
    
    
}
