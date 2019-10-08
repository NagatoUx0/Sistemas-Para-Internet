/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author CONTROLADORIA - 03
 */
public class PizzaPresunto implements Pizza {
    
    @Override
    public String ingredientes(){
        return "Ingredientes de hoje para Pizza: Queijo + presunto + tomate";
    }
    
}
