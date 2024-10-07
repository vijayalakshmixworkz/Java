package com.xworkz.collections.DTO;
public class MatchBoxDTO {
    private Double cost;
    private String brand;

    
    public MatchBoxDTO(Double cost, String brand) {
        this.cost = cost;
        this.brand = brand;
    }

    public Double getCost() {
        return cost;
    }

    
    public String getBrand() {
        return brand;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

 

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
