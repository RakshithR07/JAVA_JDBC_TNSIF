package com.tnsif.generics;

public class GenericClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<String> obj=new GenericClass<String>();
		obj.set("Hello");
		System.out.println(obj.get());
		
		GenericClass<Integer> o=new GenericClass<Integer>();
		o.set(21);
		System.out.println(o.get());
	}

}
