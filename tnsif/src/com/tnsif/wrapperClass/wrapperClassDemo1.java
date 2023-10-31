package com.tnsif.wrapperClass;

public class wrapperClassDemo1 {
	//conversion of wrapper to str by using toString() method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1=new Integer(100);
		Integer i2=new Integer(1000);
		System.out.println(i1+i2);
		
		String str1=i1.toString();
		String str2=i2.toString();
		System.out.println(str1+str2);
		
//		System.out.println("hello world");
//		//
//		System.out.println(args[0]);
//		int a= Integer.parseInt(args[0]);
//		int b= Integer.parseInt(args[1]);
//		int c=a+b;
//		System.out.println(c);
//		
	}
}
