package com.bridgelabz.inventorymanagement;

public class InventoryDets {
	private double weight;
	private double price;
	private String name;

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	public String toString()
	{
		return "Inventory Details Are:{name=" + this.name + ", weight=" + this.weight + ", price=" + this.price + "}";
	}
}