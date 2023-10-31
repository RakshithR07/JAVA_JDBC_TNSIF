package com.tnsif.wrapperClass;
class Sample
{
	
}

class Demo
{
	public Demo()
	{//resource allocate
		System.out.println("in constructor");
	}

@Override
protected void finalize() throws Throwable
{//resoure cleanup code
	System.out.println("final");
}
}
public class demoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s =new Sample();
		Sample s1= new Sample();
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		Demo d=new Demo();
		System.out.println(d.hashCode());
	d=null;
	System.gc();
		
		

	}

}
