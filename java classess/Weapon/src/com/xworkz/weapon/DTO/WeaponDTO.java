package com.xworkz.weapon.DTO;
import java.time.LocalDate;
import java.util.Objects;

public class WeaponDTO {
	private int id;
	private String name;
	private String countryMade;
	private LocalDate manfDate;

	public WeaponDTO(int id, String name, String countryMade, LocalDate manfDate) {
		this.id = id;
		this.name = name;
		this.countryMade = countryMade;
		this.manfDate = manfDate;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCountryMade() {
		return countryMade;
	}

	public LocalDate getManfDate() {
		return manfDate;
	}

	// Override equals and hashCode for Set uniqueness based on name and countryMade
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof WeaponDTO))
			return false;
		WeaponDTO weaponDTO = (WeaponDTO) o;
		return name.equals(weaponDTO.name) && countryMade.equals(weaponDTO.countryMade);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, countryMade);
	}

	@Override
	public String toString() {
		return "WeaponDTO{" + "id=" + id + ", name='" + name + '\'' + ", countryMade='" + countryMade + '\''
				+ ", manfDate=" + manfDate + '}';
	}
}
