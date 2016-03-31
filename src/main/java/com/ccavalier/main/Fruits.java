package com.ccavalier.main;

public enum Fruits {

	BANANE("banane", 150, 150),
	POMME("pomme", 100, 0),
	CERISE("cerise", 75, 30);
	
	 
	private String name;
	private int price;
	private int reduction;

	Fruits(String name, int price, int reduction){
	 this.setName(name);
	 this.setPrice(price);
	 this.setReduction(reduction);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Fruits getByName(String name){
		for(Fruits fruit : values()){
			if(fruit.name.equals(name)){
				return fruit;
			}
		}
		return null;
	}

	
	public static double getPriceByName(String name){
		for(Fruits fruit : values()){
			if(fruit.name.equals(name)){
				return fruit.getPrice();
			}
		}
		return 0.0;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getReduction() {
		return reduction;
	}

	public void setReduction(int reduction) {
		this.reduction = reduction;
	}
	
}
