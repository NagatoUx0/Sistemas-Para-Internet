package br.com.model;

public class SellStock implements Order {

	private Stock aaaStock;
	
	public SellStock(Stock aaaStock) {
		
		this.aaaStock = aaaStock;
		
	}
	
	
	
	
	public void execute() {
		
		aaaStock.sell();
		
	}
	
	

}
