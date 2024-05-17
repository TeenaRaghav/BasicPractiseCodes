package com.training.BasicPractisecodes;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPrac {
public static void main(String[] args) {
	ArrayList<String> cars = new ArrayList<String>();
	cars.add("BMW");
	cars.add("Toyota");
	cars.add("Mazda");
	cars.add("ferari");

	Iterator<String> it = cars.iterator();
	System.out.println(it.next());
	
	while(it.hasNext()) {
		String car = it.next();
		if(car=="Toyota") {
			it.remove();
		}
	}
	System.out.println(cars);
}
}
