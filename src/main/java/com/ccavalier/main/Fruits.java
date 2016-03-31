package com.ccavalier.main;

public enum Fruits {

	BANANE("banane", 150),
	POMME("pomme", 100),
	CERISE("cerise", 75);
	
	 
	private String name;
	private int price;

	Fruits(String name, int price){
	 this.setName(name);
	 this.setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
}
