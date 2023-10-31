package com.tnsif.assignment;
import java.util.*;
public class prob2 {

public static void main(String[] args) {
//		// TODO Auto-generated method stub
		 List<String> l = new ArrayList<String>();  
	        //Add elements in the list  
		 	Scanner sc= new Scanner(System.in);
		 	System.out.println("Enetr the value of n");
		 	int n= sc.nextInt();
		 	System.out.println("Enter the user names");
		 	for(int i=0;i<n;i++)
		 	{
		 		
		 		l.add(sc.nextLine());
		 	}
//		 	
	        System.out.println("List of elements: "+l);
	        System.out.println("Enter the user name to search");
	        String s=sc.nextLine();
//	        //Count the frequency of the given word      
	   		System.out.println("Frequency of the Word: "+Collections.frequency(l,s)); 
	}
	//class Test {
//	class Main {
//
//		public static void main(String args[]) {
//
//		try {
//
//		throw 10;
//
//		}
//
//		catch(int e) {
//
//		System.out.println("Got the Exception " + e);
//
//		}
//		}

}
