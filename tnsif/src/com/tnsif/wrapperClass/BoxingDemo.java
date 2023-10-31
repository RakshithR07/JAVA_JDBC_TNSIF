package com.tnsif.wrapperClass;

public class BoxingDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//unboxing - wrapper to primitive
		
		Integer i=new Integer(10);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);
		
		//Autoboxing - primitive to wrapper
		
		int a=100;
		Integer i1=a;
		System.out.println(i1);
	}

}
