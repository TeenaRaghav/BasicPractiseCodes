package com.training.BasicPractisecodes;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapAndHashTable {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "Teena");
		hm.put(2, "shakti");
		hm.put(3, "pritish");
		hm.put(4, "jai");
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
		Hashtable <Integer,String> ht = new Hashtable<>();
		ht.put(1, "john");
		ht.put(2, "tony");
		ht.put(3, "stark");
		ht.put(4, "joenna");
		for (Map.Entry m : ht.entrySet()) {
			System.out.println(m);
		}
	}

}
