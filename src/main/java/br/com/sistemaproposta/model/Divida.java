/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.model;

import br.com.sistemaproposta.controller.DividaController;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Thiago
 */
public class Divida {
    private int numDivida;
    private Contrato contrato;
    private float vlrPrincipal;
    private float vlrMultas;
    private float vlrJuros;
    private float vlrDespesas;
    private float percHonorarios;
    private float vlrCategoria;
    private float percSaldoDevedor;
    private float vlrPos;
    private float vlrDebitoBem;
    private Date dtAtraso;
    private final Date dtAtualizacao;
    private List<Proposta> propostas =new ArrayList<>();

    public Divida(int numDivida, Contrato contrato, float vlrPrincipal, float vlrMultas, float vlrJuros, float vlrDespesas, float percHonorarios, float vlrCategoria, float percSaldoDevedor, float vlrPos, float vlrDebitoBem, Date dtAtraso) {
        this.numDivida = numDivida;
        this.contrato = contrato;
        this.vlrPrincipal = vlrPrincipal;
        this.vlrMultas = vlrMultas;
        this.vlrJuros = vlrJuros;
        this.vlrDespesas = vlrDespesas;
        this.percHonorarios = percHonorarios;
        this.vlrCategoria = vlrCategoria;
        this.percSaldoDevedor = percSaldoDevedor;
        this.vlrPos = vlrPos;
        this.vlrDebitoBem = vlrDebitoBem;
        this.dtAtraso = dtAtraso;
        this.dtAtualizacao = Calendar.getInstance().getTime();
    }
    public Divida(Contrato contrato, float vlrPrincipal, float vlrMultas, float vlrJuros, float vlrDespesas, float percHonorarios, float vlrCategoria, float percSaldoDevedor, float vlrPos, float vlrDebitoBem, Date dtAtraso) {
        this.contrato = contrato;
        this.vlrPrincipal = vlrPrincipal;
        this.vlrMultas = vlrMultas;
        this.vlrJuros = vlrJuros;
        this.vlrDespesas = vlrDespesas;
        this.percHonorarios = percHonorarios;
        this.vlrCategoria = vlrCategoria;
        this.percSaldoDevedor = percSaldoDevedor;
        this.vlrPos = vlrPos;
        this.vlrDebitoBem = vlrDebitoBem;
        this.dtAtraso = dtAtraso;
        this.dtAtualizacao = Calendar.getInstance().getTime();
    }

    public int getNumDivida() {
        return numDivida;
    }

 
    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
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

    public float getPercHonorarios() {
        return percHonorarios;
    }

    public void setPercHonorarios(float percHonorarios) {
        this.percHonorarios = percHonorarios;
    }

    public float getVlrCategoria() {
        return vlrCategoria;
    }

    public void setVlrCategoria(float vlrCategoria) {
        this.vlrCategoria = vlrCategoria;
    }

    public float getPercSaldoDevedor() {
        return percSaldoDevedor;
    }

    public void setPercSaldoDevedor(float percSaldoDevedor) {
        this.percSaldoDevedor = percSaldoDevedor;
    }

    public float getVlrPos() {
        return vlrPos;
    }

    public void setVlrPos(float vlrPos) {
        this.vlrPos = vlrPos;
    }

    public float getVlrDebitoBem() {
        return vlrDebitoBem;
    }

    public void setVlrDebitoBem(float vlrDebitoBem) {
        this.vlrDebitoBem = vlrDebitoBem;
    }

    public Date getDtAtraso() {
        return dtAtraso;
    }

    public void setDtAtraso(Date dtAtraso) {
        this.dtAtraso = dtAtraso;
    }

    public Date getDtAtualizacao() {
        return dtAtualizacao;
    }
    
    public void salvar(){
        DividaController.salvar(this);
    }
    
    
    
    
}
