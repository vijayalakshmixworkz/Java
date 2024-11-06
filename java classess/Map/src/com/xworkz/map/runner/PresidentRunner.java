
package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.map.DTO.AddressDTO;
import com.xworkz.map.DTO.Code;
import com.xworkz.map.DTO.CountryDTO;
import com.xworkz.map.DTO.PresidentDTO;

public class PresidentRunner {

	public static void main(String[] args) {

		Map<CountryDTO, PresidentDTO> map = new HashMap<>();
		map.put(new CountryDTO("India", Code.INDIA), new PresidentDTO("Draupadi Murmu", 66, "IDK",
				new AddressDTO(9876543982L, "RajpathMarg", "New Delhi", "Delhi", new CountryDTO("India", Code.INDIA))));
		map.put(new CountryDTO("France", Code.FRANCE), new PresidentDTO("Emmanuel Macron", 46, "IDK",
				new AddressDTO(7865423459L, "SaintHonore", "Paris", "Ilede", new CountryDTO("France", Code.FRANCE))));
		map.put(new CountryDTO("USA", Code.UNITED_STATES),
				new PresidentDTO("Joe Biden", 81, "IDK", new AddressDTO(7654893215L, "Avenue", "Washington DC", "DC",
						new CountryDTO("USA", Code.UNITED_STATES))));
		map.put(new CountryDTO("Brazil", Code.BRAZIL), new PresidentDTO("Silva", 78, "IDK", new AddressDTO(5675432198L,
				"Praca", "Brasilia", "Distrito Federal", new CountryDTO("Brazil", Code.BRAZIL))));
		map.put(new CountryDTO("Japan", Code.JAPAN),
				new PresidentDTO("Fumio Kishida", 67, "IDK", new AddressDTO(7865423901L, "Nagata", "Tokyo",
						"Tokyo Metropolis", new CountryDTO("Japan", Code.JAPAN))));

		Set<CountryDTO> keys = map.keySet();
		keys.forEach(System.out::println);
		keys.forEach((ref) -> System.out.println(ref.getCode().getCountryCode()));
		System.out.println("-------------------------------------");
		Collection<PresidentDTO> values = map.values();
		values.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Set<Map.Entry<CountryDTO, PresidentDTO>> entries = map.entrySet();
		entries.forEach((ref) -> System.out.println(ref));

	}

}