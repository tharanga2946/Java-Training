package com.Practise;

import java.util.Scanner;

public class Palendromeint 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		int num = a.nextInt();
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int b=num%10;
			rev=rev*10+b;
			num=num/10;
		}
		if(temp==rev) 
		{
			System.out.println("Is a Palendrome");
		}
		else
		{
			System.out.println("Is Not a Palendrome");
		}
	}
}
