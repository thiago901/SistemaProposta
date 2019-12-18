/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.model;

import br.com.sistemaproposta.controller.AssessoriaController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class Assessoria {
    
    private int id;
    private String nome;
    private String cnpj;
    private List<Administradora> administradoras =new ArrayList<>();

    public Assessoria(int id,Assessoria a) {
        this.id = id;
        this.nome = a.getNome();
        this.cnpj = a.getCnpj();
        this.administradoras = a.getAdministradoras();
    }

    
    public Assessoria(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Assessoria( String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Administradora> getAdministradoras(){
        return Collections.unmodifiableList(this.administradoras);
    }
    public void adicionaAdministradoras(Administradora adm){
        this.administradoras.add(adm);
    }
    
    public void salvar(){
        AssessoriaController.salvar(this);
    }
    
}
