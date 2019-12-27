/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.ReflexaoController;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class ManipuladorObjeto {
    private final Object instancia;

    ManipuladorObjeto(Object instancia) {
        this.instancia = instancia;
        
    }

    public ManipuladorMetodo getMetodo(String executa, Class<HttpServletRequest> req, Class<HttpServletResponse> resp) {
        try {
            Method metodo = this.instancia.getClass().getMethod(executa, req,resp);
            return new ManipuladorMetodo(instancia,metodo);
        } catch (NoSuchMethodException|SecurityException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public ManipuladorMetodo getMetodo(String executa) {
        try {
            Method metodo = this.instancia.getClass().getMethod(executa);
            return new ManipuladorMetodo(instancia,metodo);
        } catch (NoSuchMethodException|SecurityException e) {
            throw new RuntimeException(e);
        }
        
    }
    
}
