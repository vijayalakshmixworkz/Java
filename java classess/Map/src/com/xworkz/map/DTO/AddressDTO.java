package com.xworkz.map.DTO;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class AddressDTO {

	private Long no;
	private String street;
	private String city;
	private String state;
	private CountryDTO country;


}