package com.bridgelabz.inventorymanagement;
import java.util.ArrayList;
public class InventoryManager {
	public static void main(String args[]) 
	{
		InventoryFactory inventoryFactory = new InventoryFactory();
		inventoryFactory.createInventory();
		ArrayList<InventoryDets> Inventory = inventoryFactory.getInventory();
		for (int i = 0; i < Inventory.size(); i++)  
		{
		System.out.println(Inventory.get(i));
		System.out.println("Total Price: "+calculateInventoryValue(Inventory.get(i)));
		}

}

private static double calculateInventoryValue(InventoryDets element) 
{
	double temp=element.getWeight() * element.getPrice();
	return temp;
}
}



