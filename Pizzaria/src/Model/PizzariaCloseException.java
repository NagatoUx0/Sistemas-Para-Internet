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
public class PizzariaCloseException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    
    public PizzariaCloseException()
  {
    super();
  }
    
    public PizzariaCloseException(String message)
  {
    super(message);
  }
}
    

