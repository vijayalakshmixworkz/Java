
package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.map.DTO.AddressDTO;
import com.xworkz.map.DTO.Code;
import com.xworkz.map.DTO.CountryDTO;


public class AddressRunner {

	public static void main(String[] args) {

		Map<String, AddressDTO> map = new HashMap<>();
		map.put("Sapnaz", new AddressDTO(8660286768L, "ShantiNagar", "Bangalore", "Karnataka",
				new CountryDTO("India", Code.INDIA)));
		map.put("Ani", new AddressDTO(8792647552L, "Bhuvaneshwari", "Anantapur", "Andhra Pradesh",
				new CountryDTO("India", Code.INDIA)));
		map.put("Gagana",
				new AddressDTO(8792632915L, "Vinayaka", "Kolar", "Karnataka", new CountryDTO("India", Code.INDIA)));
		map.put("Viji",
				new AddressDTO(7483381416L, "Rahamath", "Kolar", "Karnataka", new CountryDTO("India", Code.INDIA)));
		map.put("Sanju", new AddressDTO(9110235468L, "Ashoka Nagar", "Chikkaballapura", "Karnataka",
				new CountryDTO("India", Code.INDIA)));

		Set<String> keys = map.keySet();
		keys.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Collection<AddressDTO> values = map.values();
		values.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Set<Map.Entry<String, AddressDTO>> entries = map.entrySet();
		entries.forEach((ref) -> System.out.println(ref));

	}

}