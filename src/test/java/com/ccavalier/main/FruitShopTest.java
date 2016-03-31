package com.ccavalier.main;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class FruitShopTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	
	@Test
	public void testInput(){
//		ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
//		System.setIn(in);
//		System.setOut(new PrintStream(outContent));
//		
//
//		// do your thing
//
//		// optionally, reset System.in to its original
//		
//		FruitShop.readConsole();
//		Assert.assertEquals("My string > 0.0\n", outContent.toString());
//		
//		System.setIn(System.in);
	}
	
//	@Test
//	public void calculTotal() throws IOException{
//		//banane
//		outContent.reset();
//		ByteArrayInputStream in = new ByteArrayInputStream((Fruits.POMME.getName()).getBytes());
//		System.setIn(in);
//		FruitShop.readLine(new BufferedReader(new InputStreamReader(System.in)));
//		Assert.assertEquals(Fruits.POMME.getName()+" >"+Fruits.POMME.getPrice()+"\n", outContent.toString());
//		outContent.reset();
//		//cerise
//		in = new ByteArrayInputStream((Fruits.CERISE.getName()).getBytes());
//		System.setIn(in);
//		FruitShop.readLine(new BufferedReader(new InputStreamReader(System.in)));
//		Assert.assertEquals(Fruits.CERISE.getName()+" >175\n", outContent.toString());
//		outContent.reset();
		//cerise
		
//		in = new ByteArrayInputStream((Fruits.CERISE.getName()).getBytes());
//		System.setIn(in);
//		FruitShop.readLine(new BufferedReader(new InputStreamReader(System.in)));
////		Assert.assertEquals(Fruits.CERISE.getName()+" >250\n", outContent.toString());
//	}
	
	@Test
	public void testReduction() throws IOException{
		//banane
		outContent.reset();
				ByteArrayInputStream in = new ByteArrayInputStream((Fruits.CERISE.getName()).getBytes());
				System.setIn(in);
				FruitShop.readLine(new BufferedReader(new InputStreamReader(System.in)));
				Assert.assertEquals(Fruits.CERISE.getName()+" >"+Fruits.CERISE.getPrice()+"\n", outContent.toString());
				outContent.reset();
				//cerise
				in = new ByteArrayInputStream((Fruits.APPLE.getName()).getBytes());
				System.setIn(in);
				FruitShop.readLine(new BufferedReader(new InputStreamReader(System.in)));
				Assert.assertEquals(Fruits.APPLE.getName()+" >175\n", outContent.toString());
				outContent.reset();
				//cerise
				
				in = new ByteArrayInputStream((Fruits.CERISE.getName()).getBytes());
				System.setIn(in);
				FruitShop.readLine(new BufferedReader(new InputStreamReader(System.in)));
				Assert.assertEquals(Fruits.CERISE.getName()+" >230\n", outContent.toString());
				outContent.reset();
				//Banane
				in = new ByteArrayInputStream((Fruits.BANANE.getName()).getBytes());
				System.setIn(in);
				FruitShop.readLine(new BufferedReader(new InputStreamReader(System.in)));
				Assert.assertEquals(Fruits.BANANE.getName()+" >380\n", outContent.toString());
				outContent.reset();
				//pomme
				in = new ByteArrayInputStream((Fruits.POMME.getName()).getBytes());
				System.setIn(in);
				FruitShop.readLine(new BufferedReader(new InputStreamReader(System.in)));
				Assert.assertEquals(Fruits.POMME.getName()+" >480\n", outContent.toString());
				outContent.reset();
				//pomme
				in = new ByteArrayInputStream((Fruits.MELE.getName()).getBytes());
				System.setIn(in);
				FruitShop.readLine(new BufferedReader(new InputStreamReader(System.in)));
				Assert.assertEquals(Fruits.MELE.getName()+" >580\n", outContent.toString());
				outContent.reset();
	}
	
}
