package com.bridgelabz.inventorymanagement;

import java.util.ArrayList;

public class InventoryDataMangement {

	public static void main(String[] args) {
		ArrayList<InventoryDets> Inventory= new ArrayList<InventoryDets>();
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
		for (int i=0;i<Inventory.size();i++)
		{
			System.out.println(Inventory.get(i));
			System.out.println("Total Price:" +calculateValue(Inventory.get(i)));
		}
	}
	public static double calculateValue(InventoryDets element)
	{
		double temp= element.getWeight() * element.getPrice();
		return temp;
	}

}
