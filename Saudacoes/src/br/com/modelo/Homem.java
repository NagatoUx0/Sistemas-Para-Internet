/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author CONTROLADORIA - 03
 */
public class Homem extends Pessoa {
    
    
    public Homem(String nome){
        this.nome = nome;
        JOptionPane.showMessageDialog(null, "Olá, Senhor " + nome);
    }
    
}
