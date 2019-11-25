package br.com.model;


//Classe Receptora
public class Stock {
	
	private String name = "AAA";
	private int quantidade = 8;
	
	
	public void buy() {
		
		System.out.println("Nome:  " + name + " Quantidade: " + quantidade + " Comprado");
	}
	
	
	public void sell() {
		
		System.out.println("Nome:  " + name + " Quantidade: " + quantidade + " Vendido");
		
	}

}
