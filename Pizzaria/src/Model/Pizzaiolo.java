/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author CONTROLADORIA - 03
 */
public abstract class Pizzaiolo {
    
    public static Pizzaiolo pizzaiolo(String data) throws PizzariaCloseException{
        
        SimpleDateFormat dataDoPedido = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendario = Calendar.getInstance();
       
        try {
            calendario.setTime(dataDoPedido.parse(data));
        } catch (ParseException ex) {
           
        }
        
        switch(calendario.get(Calendar.DAY_OF_WEEK)){
            
            case Calendar.MONDAY:
            case Calendar.WEDNESDAY:
            case Calendar.FRIDAY: return new PizzaioloCalabresa();
            case Calendar.TUESDAY:
            case Calendar.THURSDAY:
            case Calendar.SATURDAY: return new PizzaioloPresunto();
            default: 
              throw new PizzariaCloseException("Pizzaria fechada aos domingos!");
        }    
     
    }    
   

  public abstract Calzone calzone();

  
  public abstract Pizza pizza();
    
    }
    

