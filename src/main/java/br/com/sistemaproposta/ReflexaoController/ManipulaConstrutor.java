/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.ReflexaoController;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago
 */
public class ManipulaConstrutor {
    private final Constructor<?> constructor;

    ManipulaConstrutor(Constructor<?> constructor) {
        this.constructor = constructor;
        
    }

    Object invoca() {
        try {
            return this.constructor.newInstance();
        } catch (InstantiationException|IllegalArgumentException|IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch(InvocationTargetException e){
            e.printStackTrace();
            throw new RuntimeException("Erro no construtor",e.getTargetException());
        }
    }
    
}
