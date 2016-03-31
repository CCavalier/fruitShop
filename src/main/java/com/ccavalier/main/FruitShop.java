package com.ccavalier.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FruitShop {
	static int sum = 0;
	static Map<Fruits, Integer> panier = new HashMap<Fruits, Integer>();
	
	public static void main(String[] args) {

        FruitShop fruitShop = new FruitShop();

       
        readConsole();

	}

	/**
	 * 
	 */
	protected static void readConsole() {
		
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
        try {

            for(int i=0; i<3; i++){
                readLine(entree);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: "+e.getMessage());
        }
	}

	/**
	 * @param entree
	 * @throws IOException
	 */
	protected static void readLine(BufferedReader entree) throws IOException {
		String myFruit = entree.readLine();
		Fruits added = Fruits.getByName(myFruit);
		addFruitToPanier(added);
		sum+=Fruits.getPriceByName(myFruit);
		appliquerReduction(myFruit);
		System.out.print(myFruit+ " >"+sum+"\n");
	}

	/**
	 * @param myFruit
	 */
	private static void appliquerReduction(String myFruit) {
		int nbCerises = panier.get(Fruits.CERISE) == null? 0 : panier.get(Fruits.CERISE);
		int nbBananes = panier.get(Fruits.BANANE) == null? 0 : panier.get(Fruits.BANANE);
		if(panier.get(Fruits.CERISE) != null
				&& nbCerises%2 == 0 
				&& Fruits.CERISE.getName().equals(myFruit)){
			sum -= Fruits.CERISE.getReduction();
		}else if(panier.get(Fruits.BANANE) != null
				&& nbBananes%2 == 0 
				&& Fruits.BANANE.getName().equals(myFruit)){
			sum -= Fruits.BANANE.getReduction();
		}
	}

	private static void addFruitToPanier(Fruits added) {
		Integer commande = panier.get(added);
		
		panier.put(added,commande == null? 1 :commande+1);	
	}
}
