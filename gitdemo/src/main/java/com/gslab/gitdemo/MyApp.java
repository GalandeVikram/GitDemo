package com.gslab.gitdemo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MyApp 
{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int number;
		System.out.println("Enter any number::");
		number =scanner.nextInt();
		if( number % 2 == 0 )
			 System.out.println("number is Even");
		else 
			 System.out.println("number is Odd");
	}
}
