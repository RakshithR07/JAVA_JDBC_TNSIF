package com.tnsif.map;

import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> h= new Hashtable<Integer,String>();
		
		h.put(10, "layer");
		h.put(15, "Line");
		h.put(20, "Space");
		h.put(25, "Size");
		System.out.println(h);//does not allow null key and values and unique ele only
		Enumeration e= h.elements();
		System.out.println("The enumeration values are:");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
