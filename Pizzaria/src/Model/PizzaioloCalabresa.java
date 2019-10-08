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
public class PizzaioloCalabresa extends Pizzaiolo {

    
    @Override
    public Calzone calzone(){
        return new CalzoneCalabresa();
    }
    
    @Override
    public Pizza pizza(){
        return new PizzaCalabresa();
    }

    public void Calzone() {
        
    }

    public void Pizza() {
        
    }
}
