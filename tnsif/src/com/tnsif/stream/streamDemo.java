package com.tnsif.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class streamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> s=Stream.of(1,2,3,4,5,6,7,8,9);
		//count the elems
		//System.out.println("No of elem:"+s.count());
		
		//s.forEach(System.out::println);//streams can be used only once, not agin and again
		Stream<String> stream=Stream.of(new String[]{"A","b","c"});
//		System.out.println(s.toString());
//		System.out.println(stream.toString());
		//creating a stream from array
		Integer[] val= new Integer[] {10,20,30,40,13,10,11,12,13};
		s=Arrays.stream(val);
		
		//map
		System.out.println("Square of"+Arrays.toString(val)+"is as follows:");
		s.map(num->num*num).forEach(System.out::println);
		//or
//		s=s.map(m->m*m);
//		s.forEach(System.out::println);
		
		
		
		//limit
		System.out.println("First two elems are:");
		Arrays.stream(val).limit(2).forEach(System.out::println);
		//skip
		System.out.println("Elems except first 4:");
		Arrays.stream(val).skip(4).forEach(System.out::println);
		
		//distinct
		System.out.println("Distinct elems are:");
		Arrays.stream(val).distinct().forEach(System.out::println);
		
		
	
	
	}

}
//Small portion --> stream 
//whole  video -  Collection
/* 
 * streams can be used only once
 * 
 * stream methods:
 * concat()
 * empty()
 * generate()
 * iterate()
 * of()
 * 
 * intermediate operations:Stream Operations ===>  Intermediate or Terminal
 * 
 * filter()
 * map()
 * flatMap()
 * distinct()
 * sorted()
 * peek()
 * limit()
 * skip()
 * 
 * Terminal operations:Returns  a result  of a certain type
 * forEach()
 * forEachOrdered()
 * toArray()
 * reduce()
 * collect()
 * min()
 * max()
 * count()
 * anyMatch()
 * allMatch()
 * noneMatch()
 * findFirst()
 * findAny()
 * 
 */
