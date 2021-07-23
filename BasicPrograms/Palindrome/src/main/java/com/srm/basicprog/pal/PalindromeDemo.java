package com.srm.basicprog.pal;

class Palindrome
{
	void checkPal(String val)
	{
		StringBuffer sb=new StringBuffer(val);
		String original=sb.toString();
		String reverse=sb.reverse().toString();
		if(original.equals(reverse))
		{
			System.out.println(reverse +" is a palindrome");
		}
		else
		{
			System.out.println(reverse + "is not a palindrome");
		}
	}
}
public class PalindromeDemo {

	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		String value1="diyashri";
		String value2="malayalam";
		p.checkPal(value1);
		p.checkPal(value2);
	}

}
