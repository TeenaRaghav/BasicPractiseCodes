package com.training.BasicPractisecodes;

public class OverloadingPrac {
	public static int sum(int x, int y) {
		return x + y;
	}

	public static double sum(double x, double y) {
		return x + y;
	}
	public static double sum(double x, double y,double z) {
		 return x + y +z;
	}
public static void name() {
	System.out.println("Teena");
}

	public static void main(String[] args) {
		int num1 = sum(2, 3);
		double num2 = sum(2.4, 3.4);
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
