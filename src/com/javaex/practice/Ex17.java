package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		int r = sc.nextInt();
		double a = (double) 4;
		double b = (double) 3;
		int r3 = r*r*r;
		double result = (a/b*3.14)*r3;
	
		
		
		System.out.println("구의 부피는: "+ result);
		
		
		
		
		sc.close();
		
		
		
	}
	

}
