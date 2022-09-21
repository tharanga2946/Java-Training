package com.Practise;

import java.util.Scanner;

public class ListofEvennumber 
{
	public static void main(String arg[]) 
	{
		
		Scanner ref = new Scanner(System.in);
		int n = ref.nextInt();
		System.out.println("List of even number from 1 to "+n+":");
		for (int i = 1; i <= n; i++)
		{
			if (i%2==0)
			{
				System.out.println(i+" Is a Even Number");	
			}
			else if (i%2==1) 
			{
			System.out.println(i+" Is a Odd Number");	
			}
		}

	}
}
