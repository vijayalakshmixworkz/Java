package com.xworkz.map.runner;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {

		Map<Long, String> map = new HashMap<>();
		map.put(8660286768L, "sapnaz@gmail.com");
		map.put(8792647552L, "ani@gmail.com");
		map.put(8792632915L, "Gagana@gmail.com");
		map.put(7483381416L, "viji@gmail.com");
		map.put(9110235468L, "sanju@gmail.com");

		Set<Long> keys = map.keySet();
		keys.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Collection<String> values = map.values();
		values.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Set<Map.Entry<Long, String>> entries = map.entrySet();
		entries.forEach((ref) -> System.out.println(ref));

	}

}
