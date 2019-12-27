/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.ReflexaoController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class ManipuladorMetodo {
    private final Object instancia;
    private final Method metodo;

    public ManipuladorMetodo(Object instancia, Method metodo) {
        this.instancia = instancia;
        this.metodo = metodo;
        
    }

    public Object invoca(HttpServletRequest req,HttpServletResponse resp){
        try {
            Object retorno = this.metodo.invoke(this.instancia, req,resp);
            return retorno;
        } catch (IllegalAccessException|IllegalArgumentException e) {
            throw new RuntimeException(e);
         
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Erro na construcao do metodo",e.getTargetException());
        }
        
    }
    public Object invoca(){
        try {
            Object retorno = this.metodo.invoke(this.instancia);
            return retorno;
        } catch (IllegalAccessException|IllegalArgumentException e) {
            throw new RuntimeException(e);
         
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Erro na construcao do metodo",e.getTargetException());
        }
        
    }
    
    
}
