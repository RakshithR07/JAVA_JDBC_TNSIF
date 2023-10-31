package com.tnsif.collections;
import java.util.*;
public class queueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q= new LinkedList<>();
		//add elem
		for(int i=0;i<5;i++)
		{
			q.add(i);
		}
		System.out.println(q);
		//remove head elem
		int rem=q.remove();
		System.out.println(q);
		System.out.println("Removed elem is"+rem);
		
		int head=q.peek();
		System.out.println("head elem is "+head);
		
		int s=q.size();
		System.out.println("size of queue is "+s);
		

	}

}
