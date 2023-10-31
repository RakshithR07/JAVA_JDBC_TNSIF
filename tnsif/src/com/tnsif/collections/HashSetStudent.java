package com.tnsif.collections;
import java.util.*;
public class HashSetStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<student> studSet= new HashSet<student>();
		addElem(studSet);
		System.out.println(studSet);
		

	}
	
	static void addElem(Set<student> studSet)
	{
		student s1= new student("Rakshith",90);
		studSet.add(s1);
		s1=new student("Pratik",97);
		studSet.add(s1);
		s1=new student("Shivam",87);
		studSet.add(s1);
		s1=new student("Harsha",89);
		studSet.add(s1);
		s1=new student("Pratika",97);
		studSet.add(s1);
		
	}

}
