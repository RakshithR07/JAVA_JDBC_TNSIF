package com.tnsif.revision;
import java.util.*;
public class HashSetRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs =new HashSet<String>();
		hs.add("Technology");
		hs.add("Technical");
		hs.add("Computer");
		hs.add("Java");
		System.out.println("Org hash set:"+hs);
		HashSet<String> hs1 =new HashSet<String>();
		hs1=(HashSet)hs.clone();
		System.out.println("Cloned hash set:"+hs1);
		
	}

}
