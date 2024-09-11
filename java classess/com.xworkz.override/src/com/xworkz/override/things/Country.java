package com.xworkz.override.things;

public class Country {
	
	    private String name;
	    private String capital;
	    private long population;
	    private double area;
	    private String continent;
	    private String currency;

	    public Country(String name, String capital, long population, double area, String continent, String currency) {
	        this.name = name;
	        this.capital = capital;
	        this.population = population;
	        this.area = area;
	        this.continent = continent;
	        this.currency = currency;
	    }

	    @Override
	    public String toString() {
	        return "Country{" +
	                "name='" + name + '\'' +
	                ", capital='" + capital + '\'' +
	                ", population=" + population +
	                ", area=" + area +
	                ", continent='" + continent + '\'' +
	                ", currency='" + currency + '\'' +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Country country = (Country) o;
	        return name.equals(country.name) && continent.equals(country.continent) && currency.equals(country.currency);
	    }

	    
	}


