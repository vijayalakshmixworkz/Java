package com.xworkz.InterfacesStandards.repository;

public interface AddressRepository {
	boolean save();
	int update();
	void delete();
	String read();
}
