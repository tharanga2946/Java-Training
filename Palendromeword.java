package com.Practise;

import java.util.Scanner;

public class Palendromeword 
{
	public static void main(String[] args) 
	{
		String a,b="gfx";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String/Number:");
		a=in.nextLine();
		int length = a.length();
		for (int i=length-1; i>=0; i--)
			b=b+a.charAt(i);
		if(a==b) 
		{
			System.out.println("Is a Palendrome");
		}
		else
		{
			System.out.println("Is Not a Palendrome");
		}
	}
}
