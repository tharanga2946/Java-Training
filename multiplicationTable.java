package com.Test;

import java.util.Scanner;

public class multiplicationTable 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter here number:");
		Scanner ref = new Scanner(System.in);
		int a = ref.nextInt();
		int table=a;
		for (int i = 1; i <= 10; i++) 
		{
			int sum = i*table;
			System.out.println(i+"*"+table+"="+sum);
		}
	}
}
