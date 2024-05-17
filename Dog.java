package com.training.BasicPractisecodes;

public class Dog extends Animal{
	public Dog(){
		super();
	}
	public static void main(String[] args) {
		Dog obj = new Dog();
	}
	@Override
	public void walk() {
		System.out.println("Dog walks");
	}
	@Override
	public void eat() {
		System.out.println("Dog eats");
	}

}
