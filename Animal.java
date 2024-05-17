package com.training.BasicPractisecodes;

public class Animal {
	protected Animal(){
		System.out.println("Animal class constructor is called");
	}
	public void walk() {
		System.out.println("Animal Walks.");
	}
	public void eat() {
		System.out.println("Animal Eats.");
	}
	public static void run() {
		System.out.println("Animal run");
	}

}
