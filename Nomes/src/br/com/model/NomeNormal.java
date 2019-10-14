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
public class NomeNormal extends Nome {

    String nome;

    public NomeNormal(String nome) {
        this.nome = nome;
    }
    
    
  
    
    private String divideNome[] =  new String[1];

    public NomeNormal(){
        divideNome = nome.split(" ");
        this.nome = divideNome[0];
        sobrenome = divideNome[1];
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getNome(){
        return divideNome[0] + " " + divideNome[1];
    }

    @Override
    public String toString() {
        return "NomeNormal{" + "nome=" + nome +  '}';
    }

    
    
  
    
    
}
