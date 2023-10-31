package com.tnsif.map;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maintains Ascending order
		SortedMap<String,String> s=new TreeMap<String,String>();
		s.put("Father", "Farmer");
		s.put("Mother", "Teacher");
		s.put("Son", "Enginner");
		s.put("Daughter", "Doctor");
		s.put("Cousin", "Manager");
		
		System.out.println(s);
		
		for(SortedMap.Entry m:s.entrySet()) // entrySet={key, value}
		{
			System.out.println(s.firstKey()+" "+ s.lastKey());
			
			
		}
		
		SortedMap<Integer,String> s1=new TreeMap<Integer,String>();
		
		s1.put(3,"three");
		s1.put(1,"one");
		s1.put(2,null);
		s1.put(4,"four");
		s1.put(6,null);
		s1.put(5,"five");	//does not allow null key but allows many null values
		s1.put(7,null);
		
		System.out.println(s1);
		

		NavigableMap<Integer,String> httpc= new TreeMap<Integer,String>();
		httpc.put(200,"OK");
		httpc.put(400,"bad");
		httpc.put(404,"not found");
		httpc.put(300,"god");
		
		System.out.println(httpc);
		System.out.println(httpc.pollFirstEntry());

		System.out.println(httpc.pollLastEntry());

		System.out.println(httpc);
		System.out.println(httpc.firstEntry());

		System.out.println(httpc.lastEntry());
		
		
	}
	
	

}
