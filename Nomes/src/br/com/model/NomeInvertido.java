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
public class NomeInvertido extends Nome {

 

    String nome;
    
       public NomeInvertido(String nome) {
        this.nome = nome;
    }
    
    private String divideNome[] = new String[1];

    public NomeInvertido(){
        divideNome = nome.split(", ");
        this.nome = divideNome[1];
        sobrenome = divideNome[0];
    }

   
    
    @Override
    public String getNome(){
        return divideNome[1] + " " + divideNome[0];
    }

    @Override
    public String toString() {
        return "NomeInvertido{" + "nome=" + nome + '}';
    }
    
    
}
