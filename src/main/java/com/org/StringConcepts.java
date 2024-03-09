package com.org;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="rama"; //r-0, a-1, m-2,a-3
		String name2="ravi";
		String name3="murali";
		String name4="hanuma";
		String name5="MURALI";
		String name6="   kiran   ";
		String name7="gopi";
		System.out.println(name1.concat(name2));
		System.out.println(name3.length());
		System.out.println(name5.toLowerCase());
		System.out.println(name6.trim());
		System.out.println(name2.toUpperCase());
		System.out.println(name1.equals(name3));
		System.out.println(name3.equals(name5));
		System.out.println(name3.equalsIgnoreCase(name5));
		System.out.println(name7.toCharArray());
		char[] cp = name7.toCharArray(); //gopi
		for(int i=0;i<cp.length;i++)
		{
			System.out.println(cp[i]);
		}
		System.out.println(name1.replace('m', 'n'));
		System.out.println(name2.replaceAll("vi", "ghu"));
		System.out.println(name2.endsWith("pi"));  //ravi
		System.out.println(name2.endsWith("vi"));  //ravi
		System.out.println(name7.startsWith("g"));
		System.out.println(name1.charAt(2));
		System.out.println(name2.hashCode());
			}

		
	}
	

