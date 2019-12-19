/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.model;

import java.util.Date;

/**
 *
 * @author Thiago
 */
public class Proposta {
    
    private int id;
    private int idDivida;
    private float vlrPrincipal;
    private float vlrMultas;
    private float vlrJuros;
    private float vlrDespesas;
    private float percHO;
    private int idParcelas;
    private String tipoProsposta;
    private String statusPagamento;
    private String statusProposta;
    private Date dtProposta;
    private Date dtVencimento;
   
    
    
}
