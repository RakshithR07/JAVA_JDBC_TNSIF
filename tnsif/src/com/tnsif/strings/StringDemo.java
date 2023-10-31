package com.tnsif.strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'I','N','D','I','A'};
		String s1=new String(c);
		String s2=new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1=" India is strong";
		s1.strip();
		System.out.println(s1);
		
		//concatenating string= concat() and +
		String s="This is to show"+" how"+" concatenation works";
		System.out.println(s);
		
		String s3=new String(" Indian ");
		String s4=s3.toUpperCase();
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3.length());
		System.out.println(s3.substring(2, 5));
		System.out.println(s3.trim());
		System.out.println(s3.strip());
		System.out.println(s3.isEmpty());
		
		
		//str comparison
		s1="Good Morning";
		s2=new String(s1);
		System.out.println(s1+" equals "+s2+"="+s1.equals(s2));
		
		//== is comparing the object references if it is referering to same instance
		System.out.println(s1+" == "+s2+"="+(s1==s2));
		
		
		//compareTo() - compares the values and returns the integer value
		
	}

}
