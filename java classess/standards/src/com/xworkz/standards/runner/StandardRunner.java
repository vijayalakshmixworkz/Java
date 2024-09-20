package com.xworkz.standards.runner;

public class StandardRunner {
public static void main(String[] args) {
	
}
}
Create a Project
Write below Repository/Service and Impl
AddressService(interface) : push(),refresh(),remove(),load()
1.AddressRepository(interface)
boolean save();
int update();
void delete();
String read();


VehicleService : persist(),merge(),clear(),search()
2.VehicleRepository
void save();
void update();
boolean delete();
String read();


MachineService : save(),update(),delete(),read()
3.MachineRepository
void save();
int update();
int delete();
int read();



