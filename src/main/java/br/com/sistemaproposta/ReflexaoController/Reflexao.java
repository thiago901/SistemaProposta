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
public class Reflexao {

    public Reflexao() {
    }

    public ManipuladorClasse refleteClasse(String fqn) {
        try {
            Class<?> classe = Class.forName(fqn);
            return new ManipuladorClasse(classe);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
    public Object retornaInstancia(String fqn) {
        Class<?> st;
        try {
            st = Class.forName(fqn);
            Constructor<?> declaredConstructor = st.getConstructor();
            return declaredConstructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException  e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao refletir Classe "+fqn,e);
        } catch(InvocationTargetException e){
            e.printStackTrace();
            throw new RuntimeException("Erro no construtor "+fqn,e);
        }
        
    }

 
    
}
