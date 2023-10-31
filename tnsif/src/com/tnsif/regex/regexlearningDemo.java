package com.tnsif.regex;
import java.util.regex.Pattern;
public class regexlearningDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen="TNSIF accenture Banglore";
		String sen2="www.tnsif.org";
		
		String[] st= sen2.split("\\.");
		for(String s:st)
		{
			System.out.println(s);
		}
		//or
		Pattern p= Pattern.compile("\\s");
		String [] st2=p.split(sen);
		for(String s1:st2)
		{
			System.out.println(s1);
		}
	}

}
