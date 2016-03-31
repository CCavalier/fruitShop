package com.ccavalier.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitShop {
	static int sum = 0;

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
		sum+=Fruits.getPriceByName(myFruit);
		System.out.print(myFruit+ " >"+sum+"\n");
	}
}
