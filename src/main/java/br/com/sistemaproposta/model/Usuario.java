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
public class Usuario {
    int id;
    String login;
    String password;

    public Usuario(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }
    
    public int getId() {
        return id;
    }

    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
