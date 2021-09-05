package com.bridgelabz.stockmanagement;
import java.util.ArrayList;
public class StockPortfolio {
public static void main(String[] args) {
		ArrayList<Stock> stockPortfolio = new ArrayList<>();
		Stock temp = new Stock();
		temp.setStockName("SBI");
		temp.setNumOfShares(10);
		temp.setSharePrice(1200);
		stockPortfolio.add(temp);
		temp = new Stock();
		temp.setStockName("Tesla");
		temp.setNumOfShares(18);
		temp.setSharePrice(2000);
		stockPortfolio.add(temp);
		temp = new Stock();
		temp.setStockName("OnePlus");
		temp.setNumOfShares(45);
		temp.setSharePrice(100);
		stockPortfolio.add(temp);
		double valueOfStock , total=0;
		for(Stock stock : stockPortfolio) {
			System.out.println(stock);
			valueOfStock=calculateStockValue(stock);
			total=total+valueOfStock;
			System.out.println("Value of Stock is "+valueOfStock);
		}
		System.out.println("TOTAL VALUE: "+total);
	}

	private static double calculateStockValue(Stock stock) {
		double temp=stock.getNumOfShares() * stock.getSharePrice();
		return temp;
	}
}
