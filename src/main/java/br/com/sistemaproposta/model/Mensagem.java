/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.model;

import br.com.sistemaproposta.controller.MensagemController;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Thiago
 */
public class Mensagem {
    int id;
    int idProposta;
    String convesa;
    Date dtConversa;

    public Mensagem(int idProposta, String convesa) {
        this.idProposta = idProposta;
        this.convesa = convesa;
        this.dtConversa = Calendar.getInstance().getTime();
    }

    public Mensagem(int id, int idProposta, String convesa, Date dtConversa) {
        this.id = id;
        this.idProposta = idProposta;
        this.convesa = convesa;
        this.dtConversa = dtConversa;
    }
    
    public int getId() {
        return id;
    }

    public int getIdProposta() {
        return idProposta;
    }

    public void setIdProposta(int idProposta) {
        this.idProposta = idProposta;
    }
    
  
    public String getConvesa() {
        return convesa;
    }

    public void setConvesa(String convesa) {
        this.convesa = convesa;
    }

    public Date getDtConversa() {
        return dtConversa;
    }

    public void setDtConversa(Date dtConversa) {
        this.dtConversa = dtConversa;
    }

    public void salvar() {
        MensagemController.salvar(this);
    }
    
    
    
}
