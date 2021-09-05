package com.bridgelabz.stockmanagement;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class StockAccount {

	private static ArrayList<Stock> stockAccount = new ArrayList<>();
	private static ArrayList<CompanyShares> transactions = new ArrayList<>();

	public StockAccount() {

		Stock tempStock = new Stock();

		tempStock.setStockName("SBI");
		tempStock.setNumOfShares(10);
		tempStock.setSharePrice(1200);
		stockAccount.add(tempStock);
		tempStock = new Stock();
		tempStock.setStockName("Tesla");
		tempStock.setNumOfShares(18);
		tempStock.setSharePrice(2000);
		stockAccount.add(tempStock);
		tempStock = new Stock();
		tempStock.setStockName("OnePlus");
		tempStock.setNumOfShares(45);
		tempStock.setSharePrice(100);
		stockAccount.add(tempStock);

	}
	public void buy(int amount, String name) {
		boolean flag = false;
		for(Stock stock: stockAccount) {
			if(stock.getStockName().equals(name)) {
				stock.setNumOfShares(stock.getNumOfShares()+amount);
				CompanyShares tempTransaction = new CompanyShares();
				LocalDateTime dateObj = LocalDateTime.now();
				tempTransaction.setName(name);
				tempTransaction.setNumOfShares(amount);
				tempTransaction.setTransactionDateTime(dateObj);
				transactions.add(tempTransaction);
				flag=true;
			}
		}
		if(!flag)
			System.out.println("Stock not found");
	}
	public void sell(int amount, String name) {
		boolean flag = false;
		for(Stock stock: stockAccount) {
			if(stock.getStockName().equals(name)) {
				flag=true;
				if(stock.getNumOfShares()-amount < 0) 
					System.out.println("No enough stocks to sell");
				else {
					stock.setNumOfShares(stock.getNumOfShares()-amount);
					CompanyShares tempTransaction = new CompanyShares();
					LocalDateTime dateObj = LocalDateTime.now();
					tempTransaction.setName(name);
					tempTransaction.setNumOfShares(amount*-1);
					tempTransaction.setTransactionDateTime(dateObj);
					transactions.add(tempTransaction);
				}
			}
		}
		if(!flag)
			System.out.println("Stock not found");
	}
	public void printReport() {
		double valueOfStock , totalValue=0;
		for(Stock stock : stockAccount) {
			System.out.println(stock);
			valueOfStock=calculateStockValue(stock);
			totalValue+=valueOfStock;
			System.out.println("Value of the Stock is "+valueOfStock);
		}
		System.out.println("Portfolio value: "+this.valueOf());

		if(transactions.size() > 0) {
			System.out.println("Transactions: ");
			for(CompanyShares transaction: transactions) {
				System.out.println(transaction);
			}
		}
	}
	private double calculateStockValue(Stock stock) {
		return stock.getNumOfShares() * stock.getSharePrice();
	}
	public double valueOf() {
		double valueOfStock , totalValue=0;
		for(Stock stock : stockAccount) {
			valueOfStock=calculateStockValue(stock);
			totalValue+=valueOfStock;
		}
		return totalValue;
	}

}
