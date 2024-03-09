package com.org;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=16;
		int b =14;
		//Airthametic
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		
		//Relation operators
		int c=18;
		int d=20;
		int e=18;
		int f=39;
		int g=10;
		int h= 12;
		System.out.println(c<d);//True
        System.out.println(c==f);//False
        System.out.println(c>=f);//False
        System.out.println(c!=e);//False
        System.out.println(g<=c);//True
        System.out.println(c==e);//T
        //Logical &&
        int i=18;
		int j=20;
		int k=18;
		int l=39;
		int m=10;
		int n= 12;
		System.out.println((j<k)&&(k<i));//Fa
        System.out.println((m>i)&&(l<m));//False
        System.out.println((n<i)&&(j>k));//T
        System.out.println((n<m)&&(l>k));//False
        System.out.println((n>m)&&(k>l));//F
        System.out.println((i<j)&&(m<n));//T
        //Logical ||
        int o=18;
		int p=20;
		int q=18;
		int r=39;
		int s=10;
		int t= 12;
		System.out.println((o<p)||(q<r));//Fa
        System.out.println((s>t)||(r<o));//False
        System.out.println((t<r)||(s>o));//T
        System.out.println((r<o)||(r>p));//False
        System.out.println((s>t)||(q>t));//F
        System.out.println((o<r)||(p<t));//T
       //Preincrement operator
        int u=80;
        int v=++u;
        System.out.println(u);
        System.out.println(v);
        //Postincrement operator
        int w=80;
        int x=w++;
        System.out.println(w);
        System.out.println(x);
      //Predecrement operator
        int u1=80;
        int v1=--u1;
        System.out.println(u1);//79
        System.out.println(v1);//79
        //Postdecrement operator
        int w1=80;
        int x1=w1--;
        System.out.println(w1);//79
        System.out.println(x1);//80
        
        
        
        

	}

}
