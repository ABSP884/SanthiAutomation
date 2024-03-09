package com.ng;

import org.testng.annotations.Test;

public class FruitsPriorityTest {

	@Test(priority=3)
	public void banana(){
		System.out.println("Banana method");
	}
	@Test(priority=5)
	public void orange(){
		System.out.println("Orange method");
	}
	@Test(priority=1)
	public void grapes(){
		System.out.println("Grapes method");
	}
	@Test(priority=2)
	public void mango(){
		System.out.println("Mango method");
	}
	@Test(priority=6)
	public void jockfrout(){
		System.out.println("Jockfrout  method");
	}
	@Test(priority=4)
	public void apple(){
		System.out.println("Apple method");
	}
}
