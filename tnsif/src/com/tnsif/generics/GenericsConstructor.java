package com.tnsif.generics;

public class GenericsConstructor {

	private double v;
	//generic constructors
	public <T extends Number>GenericsConstructor(T t)
	{
		v=t.doubleValue();
	}
	void show()
	{
		System.out.println("Value of v in double type is:"+v);
	}

}
