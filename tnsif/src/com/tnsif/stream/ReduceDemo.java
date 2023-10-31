package com.tnsif.stream;
import java.util.*;
import java.util.stream.*;
public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(1,12,-3,4,15,-6,7,8);
		Stream<Integer> s= l.stream();		
		s=s.filter(a->a>0);
		s.forEach(System.out::println);
		//or
		//s=l.stream().filter(a->a>0);
		
		s=Stream.of();
		//reduce to return max number
		Optional<Integer> res= s.reduce((a,b)->a>b?a:b);
		if(res.isPresent())
		{
			System.out.println("Max elem is:"+res.get());
		}
		else
		{
			System.out.println("Stream is empty for operation");
		}
		
		
	}

}
