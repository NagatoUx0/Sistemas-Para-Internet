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
class PizzaioloPresunto extends Pizzaiolo {

    public PizzaioloPresunto() {
    }
    
    @Override
    public Calzone calzone(){
        return new CalzonePresunto();
    }
    
    @Override
    public Pizza pizza(){
        return new PizzaPresunto();
    
}
}