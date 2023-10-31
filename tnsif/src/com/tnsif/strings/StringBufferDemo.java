package com.tnsif.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf=new StringBuffer("Hello");
		System.out.println(buf);
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		
		//appending and inserting
		String s;
		int a=42;
		buf=new StringBuffer(40);
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		s=buf.append("a=").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buf);
		
		buf=new StringBuffer("I  JAVA!");
		buf.insert(2, "like");
		System.out.println(buf);
		System.out.println(buf.reverse());
	}

}
