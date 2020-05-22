package com.gslab.gitdemo;

import java.util.Scanner;

public class UserInput {
	//welcome msg code
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		String name= sc.nextLine();
		
		System.out.println("welcome to GSlab "+name);
	}

}
