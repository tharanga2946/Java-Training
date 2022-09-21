package com.Test;

import java.util.Scanner;

public class factorialNumber 
{
	public static void main(String[] args)
	{
		Scanner ref = new Scanner(System.in);
		int a = ref.nextInt();
		int factorial = 1;
		for (int i = 1; i<=a; i++) 
		{
			factorial = factorial*i;
		}
		System.out.println("Factorial of "+a+" is :"+factorial);
	}
}
