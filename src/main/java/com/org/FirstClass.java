package com.org;

public class FirstClass implements Nursary,LKG,UKG{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass fc = new FirstClass();
		fc.AlphaBeats();
		fc.Rhyms();
		fc.Numbers();
		

	}
	public void AlphaBeats()
	{
		System.out.println("First class ");
	}
	@Override
	public void Rhyms() {
		// TODO Auto-generated method stub
		System.out.println("Rhyms ");
	}
	@Override
	public void Numbers() {
		// TODO Auto-generated method stub
		System.out.println("Numbers ");
	}

}
