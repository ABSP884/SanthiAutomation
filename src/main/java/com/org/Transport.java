package com.org;

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport t=new Transport();
		t.vehical(5);
		t.vehical(5, "Train");
	}
	public void vehical()
	{
		System.out.println("SMALL vehical");
	}
	public void vehical(int num)
	{
		System.out.println("Mediam Vehical");
	}
	public void vehical(int num,String name)
	{
		System.out.println("High Vehicle");
	}

}
