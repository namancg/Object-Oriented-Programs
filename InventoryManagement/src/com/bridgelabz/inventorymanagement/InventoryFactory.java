package com.bridgelabz.inventorymanagement;

import java.util.ArrayList;

public class InventoryFactory {
	private static ArrayList<InventoryDets> Inventory;
	public static void createInventory() {
		Inventory = new ArrayList<>();
		InventoryDets temp = new InventoryDets();
		temp.setName("Rice");
		temp.setWeight(5);
		temp.setPrice(60);
		Inventory.add(temp);
		temp = new InventoryDets();
		temp.setName("Pulse");
		temp.setWeight(4);
		temp.setPrice(30);
		Inventory.add(temp);
		temp = new InventoryDets();
		temp.setName("Wheat");
		temp.setWeight(10);
		temp.setPrice(58);
		Inventory.add(temp);
		
	}
	public ArrayList<InventoryDets> getInventory()
	{
		return Inventory;
	}
}
