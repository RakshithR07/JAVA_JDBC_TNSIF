package com.tnsif.generics;
public class SpecificMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"oone","two","three","four"};
		Integer[] i= {1,2,3,4};
		Double[] d= {1.0,2.0,3.0,4.0};
		
		displayStrArray(str);
		displayIntArray(i);
		displayDoubleArray(d);
		

	}
	private static void displayStrArray(String[] str)
	{
		
		for(String s:str)
		{
			System.out.println(s);
			
		}
	}
	private static void displayIntArray(Integer[] i)
	{
		
		for(Integer s:i)
		{
			System.out.println(s);
			
		}
	}
	private static void displayDoubleArray(Double[] d)
	{
		
		for(Double s:d)
		{
			System.out.println(s);
			
		}
	}


}
