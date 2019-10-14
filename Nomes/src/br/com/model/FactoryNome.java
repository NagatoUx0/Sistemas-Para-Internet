/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

/**
 *
 * @author CONTROLADORIA - 03
 */
public class FactoryNome {

    public FactoryNome() {
    }
    
    public Nome criaNome(String nome){
        if (nome.indexOf(",") > 0 ){
            return new NomeInvertido(nome);
        }else{
            return new NomeNormal(nome);
        }
      
    }
    
       
}
