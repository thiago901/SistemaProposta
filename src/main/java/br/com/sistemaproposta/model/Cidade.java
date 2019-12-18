package br.com.sistemaproposta.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thiago
 */
public class Cidade {
    private int id;
    private String cidade;
    private Estado estado;

    public Cidade(int id, Estado estado) {
        this.id = id;
        this.estado = estado;
    }

    public Cidade(int id, String cidade, Estado estado) {
        this.id = id;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
    
}
