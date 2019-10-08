/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pizzaiolo;
import java.util.Scanner;

/**
 *
 * @author CONTROLADORIA - 03
 */
public class Aplication {
    
     public Aplication() {
    }
    
     
    public static void main(String args[]){
    
    System.out.println("----------☺Pizzaria☺-------------");
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite a data de Hoje('dd/mm/aaaa'): ");
    String data = entrada.next();
    
    Pizzaiolo pizzaiolo = Pizzaiolo.pizzaiolo(data);
    System.out.println(pizzaiolo.pizza().ingredientes());
    System.out.println(pizzaiolo.calzone().ingredientes());
            

    


    
    
}
    
}
