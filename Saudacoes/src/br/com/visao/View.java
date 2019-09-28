/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao;

import br.com.modelo.FabricaPessoas;
import br.com.modelo.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author CONTROLADORIA - 03
 */
public class View {
    
    public static void main (String args []){
        
        FabricaPessoas factory = new FabricaPessoas();
        
        String name = JOptionPane.showInputDialog("Qual é seu nome? ");
        String nome = name;
        
        String sex = JOptionPane.showInputDialog("Qual seu sexo? ");
        String sexo = sex;
        factory.getPessoa(nome, sexo);
        
        
    }
    
}
