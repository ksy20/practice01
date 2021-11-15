package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원의 개수: ");
		int coin500 = sc.nextInt();
		
		System.out.print("100원의 개수: ");
		int coin100 = sc.nextInt();
		
		System.out.print("50원의 개수: ");
		int coin50 = sc.nextInt();
		
		System.out.print("10원의 개수: ");
		int coin10 = sc.nextInt();
		
		int a = 500*coin500;
		int b = 100*coin100;
		int c = 50*coin50;
		int d = 10*coin10;
		
		int sum = a+b+c+d;
		
		
		System.out.println("동전의 총합은 " + sum);
		
		
		sc.close();
		
		
		
		
		
	}
	
	
	
	
	

}
