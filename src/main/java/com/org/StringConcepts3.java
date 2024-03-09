package com.org;

public class StringConcepts3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="kiran";
		String name2="kiran";
		String name3=new String("kiran");
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		System.out.println(System.identityHashCode(name3));
		System.out.println(name2.equals(name3));
		System.out.println(name2==name3);
	}

}
