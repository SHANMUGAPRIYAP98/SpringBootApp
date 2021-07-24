package com.srm.stringutil;

public class StringDemo {

	public static void reverseString(String val)
	{
		StringBuffer sb=new StringBuffer(val);
		String original=sb.toString();
		String reversed=sb.reverse().toString();
		System.out.println(reversed+" is reversed string");
	}

}
