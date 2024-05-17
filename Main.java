package com.training.BasicPractisecodes;

public class Main implements Pets{
	private Main(){
		System.out.println("Main class constructor is called");
	}
public static void main(String[] args) {
	Main pet = new Main();
		pet.eat();
		pet.fluffy();
		pet.sleep();
		pet.play();
		pet.legs();
}

@Override
public void eat() {
System.out.println("fish eats");	
}
@Override
public void fluffy() {
System.out.println("cats are fluffy");
	
}
@Override
public void legs() {
	System.out.println("cat has 4  legs");
	
}
@Override
public void sleep() {
	System.out.println("pet sleep");
	
}
@Override
public void play() {
	System.out.println("pets play");
	
}

}
