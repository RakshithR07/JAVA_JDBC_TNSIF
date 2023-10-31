package com.tnsif.collections;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v= new Vector<>();
		v.add("Dog");
		v.add("Cat");
		v.add("Horse");
		System.out.println("Initial vector:"+v);
		
		//using get()
		String elem = v.get(2);
		System.out.println("get:"+elem);
		
		//using iterator
		Iterator<String> it= v.iterator();
		System.out.println("vector:");
		while(it.hasNext())
		{
			System.out.println(it.next());
			
			
		}
		//using remove
		elem=v.remove(1);
		System.out.println("Removed elem:"+elem);
		
	}

}
