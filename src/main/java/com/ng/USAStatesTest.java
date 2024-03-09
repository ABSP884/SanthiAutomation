package com.ng;

import org.testng.annotations.Test;

public class USAStatesTest {
	@Test(dependsOnMethods={"dallos"})
	public void texas() {
		System.out.println("Texas Method");
		
	}
	@Test(dependsOnMethods={"washingtondc"})
	public void george() {
		System.out.println("George Method");
		
	}
	@Test(dependsOnMethods= {"newjersy"})
	public void dallos() {
		System.out.println("Dallos Method");
		
	}
	@Test(dependsOnMethods={"chicago"})
	public void washington() {
		System.out.println("Washington Method");
		
	}
	@Test
	public void newjersy() {
		System.out.println("Newjersy Method");
		
	}
	@Test(dependsOnMethods={"texas"})
	public void chicago() {
		System.out.println("Chicago Method");
		
	}
	@Test(dependsOnMethods={"washington"})
	public void washingtondc() {
		System.out.println("Washingtondc Method");
		
	}

}
