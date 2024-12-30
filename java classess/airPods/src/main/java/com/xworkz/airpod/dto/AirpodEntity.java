package com.xworkz.airpod.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "airpod_info")
public class AirpodEntity {
	@Id
	private int id;
	private String model_name;
	private String brand;
	private String release_date;
	private int battery_life;
	private String noise_cancellation;
	private String bluetooth_version;
	private int price;
	private int stock_count;
	private String description;



}
