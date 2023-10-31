package com.tnsif.revision;
import java.util.*;
public class KinkedListRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs =new HashSet<String>();
		
		hs.add("Technical");
		
		hs.add("Java");
		hs.add("c++");
		hs.add("C");
		System.out.println("Org hash set:"+hs);
		
HashSet<String> hs1 =new HashSet<String>();
		
		hs1.add("Technical");
		
		hs1.add("Java");
		hs1.add("python");
		hs1.add("perl");
		System.out.println("Org hash set:"+hs1);
		HashSet<String> h =new HashSet<String>();
		for( String i:hs)
		{
			for (String j : hs1)
			{
				if(i==j)
				{
					h.add(i);
				}
			}
		}
		System.out.println("Org hash set:"+h);
		//Or
		hs.retainAll(hs1);
		System.out.println("Org hash set:"+hs);
		
		
	}

}
