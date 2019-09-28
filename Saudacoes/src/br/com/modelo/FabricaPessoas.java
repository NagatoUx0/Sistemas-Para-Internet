/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

/**
 *
 * @author CONTROLADORIA - 03
 */
public class FabricaPessoas {
    
    public Pessoa getPessoa(String nome, String sexo){
        
            if(sexo.equals("M"))
                return new Homem(nome);
            if(sexo.equals("F"))
                return new Mulher(nome);
            if (sexo.equals("I"))
                return new Indefinido(nome);
        return null;
                  
    }
    
}
