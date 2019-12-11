/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.ReflexaoController;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago
 */
public class ManipuladorClasse {
    private final Class<?> classe;
    
    public ManipuladorClasse(Class<?> classe){
        this.classe = classe;
        
    }

    public ManipulaConstrutor getConstrutor() {
        try {
            Constructor<?> construtor =classe.getConstructor();
            return new ManipulaConstrutor(construtor);
        } catch (NoSuchMethodException|SecurityException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } 
    }

    public ManipuladorObjeto criaInstancia() {
        Object objeto = getConstrutor().invoca();
        return new ManipuladorObjeto(objeto);
    }

    
    
}
