package com.training.BasicPractisecodes;

public class BoxingAndUnboxing {
public static void main(String[] args) {
//	Boxing - primitive to its corresponding wrapper classes
	int data = 1;
	Integer intdata= Integer.valueOf(data);
	System.out.println(intdata);
//	Unboxing - back from wrapper class to its primitive data types
	Integer Id= Integer.valueOf(20);
	int data2 = Id.intValue();
}
}
