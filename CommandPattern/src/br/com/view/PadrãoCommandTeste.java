package br.com.view;

import br.com.model.Broker;
import br.com.model.BuyStock;
import br.com.model.SellStock;
import br.com.model.Stock;

public class PadrãoCommandTeste {

	public static void main(String[] args) {
		
		Stock aaaStock = new Stock();
		
		BuyStock bStockOrder = new BuyStock(aaaStock);
		SellStock sellStockOrder = new SellStock(aaaStock);
		Broker broker = new Broker();
		
		broker.takeOrder(bStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.takeOrder(bStockOrder);
		
		broker.placeOrder();

	}

}
