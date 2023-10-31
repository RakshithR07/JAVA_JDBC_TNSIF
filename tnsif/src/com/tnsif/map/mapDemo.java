package com.tnsif.map;
import java.util.*;
public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m= new HashMap<Integer,String>();
		m.put(96,"Rakshith");
		m.put(97,"Shivam");
		m.put(98,"ShreeHarsha");
		System.out.println(m);
		
		Map<String,String> h= new HashMap<String,String>();
		
		h.put("First","way");
		h.put("Second","Gate");
		h.put("Third","wall");
		h.put("Fourth","person");
		
		System.out.println(h);
		//hashmap maintains no proper output while displaying hence we use the linkedList HashMap
		
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		hm.put(null, "MNC");
		hm.put(null, "TCS");
		hm.put(null, "Google");
		hm.put(100, "CTS");
		hm.put(101, "VI");
		System.out.println(hm);
		System.out.println(hm.get(100));
		
		
		// hashmap can have only 1 null key, if there are more null key it takes recently updated one.

	}

}
