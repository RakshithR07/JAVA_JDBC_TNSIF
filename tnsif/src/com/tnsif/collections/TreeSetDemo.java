package com.tnsif.collections;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> num= new TreeSet<>();
		num.add(21);
		num.add(19);
		num.add(23);
		num.add(13);
		num.add(23);
		num.add(1);
		num.add(3);
		num.add(3);
		num.add(5);
		System.out.println("TreeSet:"+num);
		System.out.println(num.lower(19) + "lower");
		
		System.out.println("TreeSet:"+num.first());
		System.out.println("TreeSet:"+num.last());
		
		
		
		//Access the elem of a TreeSet
		
		Iterator<Integer> it= num.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	

}

/*
 * //Methods for Navigating
	first()- return 1st ellem of set
	last()- return last
	ceiling()- return the lowest elem
	floor() - return the greatet elem
	higher() 
	lower()- returns the greatest elem than specified num
	pollFirst()
	pollLast()
	headSet()
	tailSet()
	subSet()
	*/
