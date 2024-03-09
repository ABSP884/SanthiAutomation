package com.org;

public class OlympicGames implements Run,Jump,Swim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OlympicGames og = new OlympicGames();
		og.cycle();
		og.jumping();
	}
	public void cycle()
	
	{
		System.out.println("100Km cycling ");
	}

   public void throughball()
	
	{
	   System.out.println("10Km Throughball ");
	}
@Override
public void swimming() {
	 System.out.println("10Km Swimming ");
	
}
@Override
public void jumping() {
	 System.out.println("10Km Jumping ");
	
}
@Override
public void running() {
	 System.out.println("10Km Running ");
	
}
   
}
