package com.srm.basicprog.arm;

class Armstrong
{
	void checkArmstrong(int num)
	{
		int temp=num;
		int digits=0;
		int sum=0;
		for(;num!=0;num=num/10)
		{
			digits=(int) (num%10);
			sum=(int) (sum+Math.pow(digits, 3));
		}
		if(sum==temp)
		{
			System.out.println(sum+" is an Armstrong Number");
		}
		else
		{
			System.out.println(sum+" is not an Armstrong Number");
		}
	}
}
public class ArmstrongDemo {

	public static void main(String[] args) {
		Armstrong am=new Armstrong();
		int num1=153;
		int num2=567;
		am.checkArmstrong(num1);
		am.checkArmstrong(num2);

	}

}
