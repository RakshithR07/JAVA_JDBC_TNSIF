package com.tnsif.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class quizqueue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q= new LinkedList<>();
		
		q.add("a");
		q.add("b");
		q.add("c");
		q.add("d");
		
		System.out.println(q);
		
		Iterator<String> it=q.iterator();
		while(it.hasNext())
		{
			System.out.println(q.peek());
			System.out.println(q.poll());	
		}
		System.out.println(q.peek());
		
//		
//		Scanner b1 = new Scanner(System.in);						
//		Queue<Character>s1=new PriorityQueue<Character>();
//		char x = b1.next().charAt(0);
//		char y = b1.next().charAt(0);
//		char z = b1.next().charAt(0);
//		char w = b1.next().charAt(0);
//		s1.offer(x);
//		s1.offer(y);
//		s1.offer(z);
//		s1.offer(w);
//		System.out.println(s1.peek() +" " +s1.poll() +" " +s1.peek() +" " +s1.poll() +" " +s1.peek() +" " +s1.poll()+" " +s1.peek() +" " +s1.poll());
		//System.out.println(s1.peek());
////		System.out.println(q);
//		
		

	}


}
