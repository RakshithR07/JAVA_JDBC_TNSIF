package com.tnsif.generics;

public class genericConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number to double conversion");
		GenericsConstructor obj=new GenericsConstructor(10);
		obj.show();
		GenericsConstructor obj1=new GenericsConstructor(1136.8F);
		obj1.show();

	}

}
//Generics = to provide type safety and avoid explicit type problems
