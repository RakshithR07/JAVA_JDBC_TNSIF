package com.tnsif.generics;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String[] str={"oone","two","three","four"};
				Integer[] i= {1,2,3,4};
				Double[] d= {1.0,2.0,3.0,4.0};
				
				displayArray(str);
				displayArray(i);
				displayArray(d);
				

			}
			//Generic method
	private static <T> void displayArray(T[] array)
	{
		for(T t:array)
		{
			System.out.println(t);
		}
	}

		


	

}
