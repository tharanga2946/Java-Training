package com.Test;

import java.util.Scanner;

public class evenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = ref.nextInt();
		for (int i = 1; i <= n; i++)
		{
			if (i%2==0)
			{
				System.out.println(i+ " Is a Even number");
			} 
			else if (i%2==1) 
			{
				System.out.println(i+ " Is a Odd number");
			}  
		}

	}
}
