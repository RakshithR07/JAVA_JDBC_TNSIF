package com.tnsif.collections;
//import java.util.*;

public class student {
	int marks;
	String name;
	//Constructor
	public student(String name,int marks)
	{
		this.marks=marks;
		this.name=name;
		
	}
	//getters and setters
	public int getMarks()
	{
		return marks;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMarks(int marks)
	{
		this.marks= marks;
	}
	
	@Override
	public int hashCode()//return a hashcode value for this object
	{
		final int prime=31;
		int res=1;
		res=prime*res+marks;
		res=prime*res+((name==null)?0:name.hashCode());
		return res;
	}//s[0] *31Mod(n-1)+	
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		if(this==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
	
	
	student other= (student)obj;
	if(marks!=other.marks)
		return false;
	
	if(name==null)
	{
		if(other.name!=null)
			return false;
	}
	else if(!name.equals(other.name))
		return false;
	return true;
	}
	
	
	public String toString()
	{
		return "Student[marks="+marks+",name="+name+"]";
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
