package Entities;

import Abstract.Entity;

public class Game implements Entity {
	private int id;
	private String name;
	private double unitPrice;
	
	public Game(){}

	public Game(int id, String name, double unitPrice) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	//TRYING
	@Override
	public String toString() {
		return "GameItem [id=" + id + ", name=" + name + ",unit price=" + unitPrice + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	

}
