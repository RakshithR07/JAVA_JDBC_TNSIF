package com.tnsif.assignment;
import java.util.*;
public class queue1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			Queue<Integer> q= new LinkedList<>();
			//add elem
			System.out.println("Enter the n value:");
			int n=sc.nextInt();
			System.out.println("Enter the elements of queue:");
			int a;
			for(int i=0;i<n;i++)
			{
				
				a=sc.nextInt();
				q.add(a);
			}
			System.out.println("Enter the number to search");
			int b= sc.nextInt();
			System.out.println(q);
			//remove head elem
			int rem=q.remove();
			System.out.println("Removed elem is"+rem);
			System.out.println(q);
			
			
			int head=q.peek();
			System.out.println("head elem is "+head);
			
			int s=q.size();
			System.out.println("size of queue is "+s);
			if(q.contains(b))
			{
				System.out.println("The element is present");
				
			}
			else
			{
				System.out.println("The element is not present");
			}
			

		

	}

}
