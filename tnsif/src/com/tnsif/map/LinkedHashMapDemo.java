package com.tnsif.map;
import java.util.*;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> l= new LinkedHashMap<Integer,String>();
		//maintains the insertion order
		l.put(10, "Good");
		l.put(15, "4");
		l.put(20, "Good");
		l.put(25, "Welcome");
		l.put(30, "God");
		
		System.out.println(l);
		System.out.println(l.containsKey(20));
		System.out.println(l.containsKey(5));
		
		
		
		
		
	}

}
