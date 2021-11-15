package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");
		double w = sc.nextDouble();
		System.out.print("세로를 입력하세요: ");
		double h = sc.nextDouble();
		
		double a = w*h;
		double b = (h*2)+(w*2);
		
		System.out.println("사각형의 넓이는: "+ a);
		System.out.println("사각형의 둘레는: " + b);
		
		sc.close();
		
		
	}

}
