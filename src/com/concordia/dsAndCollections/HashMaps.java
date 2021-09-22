package com.concordia.dsAndCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		HashMap users = new HashMap<>();
		users.put("Bob", 32);
		users.put("Sandra", 42);

		System.out.println(users.get("Bob"));
		System.out.println(users.get("Sandra"));

		if (users.containsKey("Sandra")) {
			System.out.println("Cool");
		} else {
			System.out.println("Not allowed");
		}

		System.out.println(users.values());

		System.out.println("Complete map: " + users.entrySet());

		Iterator iterator = users.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry pair = (Map.Entry) iterator.next();

			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
		
		HashMap<String, Integer> newUsers = new HashMap<>();
		newUsers.put("Jack", 33);
	}

}
