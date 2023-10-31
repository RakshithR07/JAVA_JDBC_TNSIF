package com.tnsif.assignment;

import java.util.*;
import java.util.Map;

public class prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Map<String,Integer> m= new HashMap<String,Integer>();
		System.out.println("Enter the value of n");
	 	int n= sc.nextInt();
	 	System.out.println("Enter the name and roll no.");
	 	for(int i=0;i<n;i++)
	 	{
	 		String s=sc.next();
	 		int a=sc.nextInt();
	 		m.put(s,a);
	 	}
	 	
	 	
	 	System.out.println("Enter the name to replace the roll no.");
	 	String b=sc.next();
	 	System.out.println("Enter the roll no.");
	 	int t= sc.nextInt();
	 	System.out.println(m);
	 	m.replace(b,t);
	 	System.out.println(m);
	 	

	}

}
