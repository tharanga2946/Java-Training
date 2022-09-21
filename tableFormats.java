package com.Test;

import java.util.Scanner;

public class tableFormats 
{
	public static void main(String[] args) 
	{
		Scanner ref = new Scanner(System.in);
		int a = ref.nextInt();
		System.out.println("Enter the number for multiplication table: "+a);
		int table = a;
		for (int i = 1; i <= 10; i++)
		{
			int sum = i*table;
			System.out.println(+i+"*"+a+"="+sum);	
		}
	}

}
