package com.xworkz.formJDBC.dto;

public class FormDTO {

	private int id;
	private String name;
	private long phoneno;
	private String email;
	private String password;
	private String address;
	private String city;

	public FormDTO(int id, String name, long phoneno, String email, String password, String address,
			String city) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "FormDTO [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", email=" + email
				+ ", password=" + password + ", address=" + address + ", city=" + city + "]";
	}

}