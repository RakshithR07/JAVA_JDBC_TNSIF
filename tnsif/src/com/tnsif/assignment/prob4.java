package com.tnsif.assignment;
import java.util.*;
public class prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	 	System.out.println("Enter the value of n");
	 	int n= sc.nextInt();
	 	System.out.println("Enter the value");
	 	int a= sc.nextInt();
	 	int temp=a;
	 	int rev=0;
	 	for(int i=0;i<n;i++)
	 	{
	 		
	 		rev=rev*10+temp%10;
	 		temp=temp/10;
	 		
	 	}
	 	//System.out.println(rev);
	 	if(rev==a)
	 	{
	 		System.out.println("It is a Palindrome");
	 	}
	 	else
	 	{
	 		System.out.println("It is not a Palindrome");
	 	}
	 	
	 	
	 	
	 	
	}

}
