/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.model;

import br.com.sistemaproposta.controller.ClienteController;

/**
 *
 * @author Thiago
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf_cnpj;
    private Cidade cidade;

    public Cliente(int id, String nome, String cpf_cnpj, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.cidade = cidade;
    }

    public Cliente(String nome, String pf_pj, Cidade cidade) {
        this.nome = nome;
        this.cpf_cnpj = pf_pj;
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

    public String getCpf_Cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_Cnpj(String pf_pj) {
        this.cpf_cnpj = pf_pj;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void salvar() {
        ClienteController.salvar(this);
    }
    
    
}
