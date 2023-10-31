package com.tnsif.collections;
import java.util.*;
public class priorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new PriorityQueue<>();
		q.add("Core java");
		q.add("React");
		q.add("HTML");
		q.add("Angular");
		
		System.out.println("Queue elem" +q);
		
		q.remove();
		System.out.println("After removed"+q);
		System.out.println("Poll method"+q.poll());//prints top or head elem and removes it from the queue
		System.out.println("Final queue"+q);
		
		System.out.println("peek of queue"+q.peek());
		
		q.poll();
		System.out.println("Final queue"+q);
		
		
		Iterator<String> it=q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
	}

}
