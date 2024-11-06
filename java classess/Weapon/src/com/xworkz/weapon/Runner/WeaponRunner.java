package com.xworkz.weapon.Runner;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import com.xworkz.weapon.DTO.*;

public class WeaponRunner {
	    public static void main(String[] args) {
	        Set<WeaponDTO> weaponSet = new HashSet<>();

	        // Adding 10 WeaponDTO objects
	        weaponSet.add(new WeaponDTO(1, "AK-47", "Russia", LocalDate.of(2025, 1, 1)));
	        weaponSet.add(new WeaponDTO(2, "M16", "USA", LocalDate.of(2023, 5, 20)));
	        weaponSet.add(new WeaponDTO(3, "Glock 17", "Austria", LocalDate.of(2022, 3, 15)));
	        weaponSet.add(new WeaponDTO(4, "FAMAS", "France", LocalDate.of(2024, 6, 10)));
	        weaponSet.add(new WeaponDTO(5, "L85A1", "UK", LocalDate.of(2026, 7, 21)));
	        weaponSet.add(new WeaponDTO(6, "Tavor X95", "Israel", LocalDate.of(2022, 12, 1)));
	        weaponSet.add(new WeaponDTO(7, "SCAR-L", "Belgium", LocalDate.of(2024, 2, 14)));
	        weaponSet.add(new WeaponDTO(8, "AUG", "Austria", LocalDate.of(2023, 8, 30)));
	        weaponSet.add(new WeaponDTO(9, "MP5", "Germany", LocalDate.of(2025, 9, 25)));
	        weaponSet.add(new WeaponDTO(10, "M4A1", "USA", LocalDate.of(2024, 4, 22)));

	        // 1. Unique weapons based on name and countryMade
	        System.out.println("Weapons in Set:");
	        weaponSet.forEach(System.out::println);

	        // 2. Get all weapons where manfDate is greater than 2024
	        List<WeaponDTO> weaponsAfter2024 = weaponSet.stream()
	                .filter(w -> w.getManfDate().isAfter(LocalDate.of(2024, 12, 31)))
	                .collect(Collectors.toList());
	        System.out.println("\nWeapons manufactured after 2024:");
	        weaponsAfter2024.forEach(System.out::println);

	        // 3. Get all weapons where manfDate is less than 2024
	        List<WeaponDTO> weaponsBefore2024 = weaponSet.stream()
	                .filter(w -> w.getManfDate().isBefore(LocalDate.of(2024, 1, 1)))
	                .collect(Collectors.toList());
	        System.out.println("\nWeapons manufactured before 2024:");
	        weaponsBefore2024.forEach(System.out::println);

	        // 4. Get a weapon by id using Optional
	        int searchId = 5; // Example ID to search
	        Optional<WeaponDTO> weaponOptional = weaponSet.stream()
	                .filter(w -> w.getId() == searchId)
	                .findFirst();

	        System.out.println("\nWeapon with ID " + searchId + ":");
	      //  weaponOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Weapon not found."));

	        // 5. Sort elements by id in descending order
	        List<WeaponDTO> sortedWeapons = weaponSet.stream()
	                .sorted(Comparator.comparingInt(WeaponDTO::getId).reversed())
	                .collect(Collectors.toList());
	        System.out.println("\nWeapons sorted by ID in descending order:");
	        sortedWeapons.forEach(System.out::println);
	    }
	}