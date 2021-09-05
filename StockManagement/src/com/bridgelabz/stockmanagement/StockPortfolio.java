package com.bridgelabz.stockmanagement;
import java.util.ArrayList;
public class StockPortfolio {
public static void main(String[] args) {
	StockAccount stockAccount = new StockAccount();
	System.out.println("Initial: ");
	stockAccount.printReport();
	System.out.println();
	stockAccount.buy(10, "SBI");
	stockAccount.sell(3, "OnePlus");
	System.out.println("Report: ");
	stockAccount.printReport();
}
}
