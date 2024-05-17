package com.training.BasicPractisecodes;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListAndArrays {
	public static void main(String[] args) {
		HashSet<String> arr = new HashSet<>();
		arr.add("teena");
		arr.add("jai");
		arr.add("pritish");
		arr.add("shakti");
		
		for (String ele : arr) {
			System.out.println(ele);
		}
		
		String[] arr1 = new String[5];
		arr1[0]= "teena";
		arr1[1]= "pritish";
		arr1[2]= "jai";
		arr1[3]= "Shakti";

		for (String ar : arr1 ) {
			System.out.println(ar);
		}
	}
}
