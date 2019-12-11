/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.model;

/**
 *
 * @author Thiago
 */
public class Cliente {
    private int id;
    private String nome;
    private String pf_pj;
    private Cidade cidade;

    public Cliente(int id, String nome, String pf_pj, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.pf_pj = pf_pj;
        this.cidade = cidade;
    }

    public Cliente(String nome, String pf_pj, Cidade cidade) {
        this.nome = nome;
        this.pf_pj = pf_pj;
        this.cidade = cidade;
    }

    
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPf_pj() {
        return pf_pj;
    }

    public void setPf_pj(String pf_pj) {
        this.pf_pj = pf_pj;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
}
