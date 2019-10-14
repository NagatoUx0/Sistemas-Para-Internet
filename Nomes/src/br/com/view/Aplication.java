/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.model.FactoryNome;
import java.util.Scanner;


/**
 *
 * @author CONTROLADORIA - 03
 */
public class Aplication {
    
    public static void main(String args []){
        
        FactoryNome fabrica = new FactoryNome();
        
        String nome1 = "Amaro Miranda";
	String nome2 = "Miranda, Amaro";

        System.out.println(fabrica.criaNome(nome1));
	System.out.println(fabrica.criaNome(nome2));
        
        
    }
    
}
