package com.tnsif.collections;
import java.util.*;
public class DequeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> d=new ArrayDeque<>();
		d.addFirst(21);
		d.addLast(05);
		d.addLast(06);
		d.addLast(07);
		d.addLast(8);
		d.addLast(9);
		d.remove();
		d.removeFirst();
		
		System.out.println(d);
		
		
		

	}

}
