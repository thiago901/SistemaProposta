/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaproposta.ReflexaoController;

import br.com.sistemaproposta.ReflexaoController.ManipuladorClasse;
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

 
    
}
