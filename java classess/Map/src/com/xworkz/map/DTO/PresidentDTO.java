package com.xworkz.map.DTO;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class PresidentDTO {

	private String name;
	private int age;
	private String primaryWork;
	private AddressDTO address;

}