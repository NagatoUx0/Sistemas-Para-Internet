package br.com.model;

public class BuyStock implements Order{
	
	private Stock aaaStock;
	
	public BuyStock (Stock aaaStock) {
		
		this.aaaStock = aaaStock;
		
	}
		
	
	public void execute() {
		
		aaaStock.buy();
		
	}
	
	

}
