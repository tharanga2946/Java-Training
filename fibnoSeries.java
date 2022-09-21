package com.Test;

import java.util.Scanner;

public class fibnoSeries 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter here number:");
		Scanner ref = new Scanner(System.in);
		int x = ref.nextInt();
		int n=x;
		int a=0;
		int b=1;
		System.out.print(a+","+b);
		for (int i = 0; i <= n; i++) 
		{
		 int c=a+b;
		 a=b;
		 b=c;
		 System.out.print(","+c);
		}
	}

}
