package com.org;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle(20,"BUS");
		v.passingers();
		
		Vehicle cp=new Vehicle();
	}
	public  Vehicle()
	{
		System.out.println("This is a constructer");
	}
	public void passingers() {
		System.out.println("Passingers will move through vehicles");
	}
	public Vehicle(int persons,String vehicalType)
	{
		System.out.println("Taoatal passingers : "+persons);
		System.out.println("Vehical Type : "+vehicalType);
	}
}
