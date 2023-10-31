package com.tnsif.regex;
import java.util.regex.*;
public class regexDemo {
	public static void main(String args[])
	{
		String sen="This is a class for JAVA fullstack developer";
		Pattern p= Pattern.compile("is");
		Matcher m=p.matcher(sen);
		while(m.find())
		{
			System.out.println(m.group());
		}
		
	}

}
/*java.util.regex
Pattern- compiled representation of re
Matcher- interprets the pattern
PatternSyntaxException - unchecked exception

Split Method

*/