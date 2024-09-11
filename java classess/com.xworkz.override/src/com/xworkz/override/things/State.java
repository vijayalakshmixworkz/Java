package com.xworkz.override.things;

public class State {
	
	    private String name;
	    private String capital;
	    private long population;
	    private double area;
	    private String country;
	    private String officialLanguage;

	    public State(String name, String capital, long population, double area, String country, String officialLanguage) {
	        this.name = name;
	        this.capital = capital;
	        this.population = population;
	        this.area = area;
	        this.country = country;
	        this.officialLanguage = officialLanguage;
	    }

	    @Override
	    public String toString() {
	        return "State{" +
	                "name='" + name + '\'' +
	                ", capital='" + capital + '\'' +
	                ", population=" + population +
	                ", area=" + area +
	                ", country='" + country + '\'' +
	                ", officialLanguage='" + officialLanguage + '\'' +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        State state = (State) o;
	        return name.equals(state.name) && country.equals(state.country) && officialLanguage.equals(state.officialLanguage);
	    }

	   
	}


