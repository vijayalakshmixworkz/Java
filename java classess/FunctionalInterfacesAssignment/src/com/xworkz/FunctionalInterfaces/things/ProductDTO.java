package com.xworkz.FunctionalInterfaces.things;

public class ProductDTO {
    public int id;
    public String name;
    public String vendor;
    public double cost;

    public ProductDTO(int id, String name, String vendor, double cost) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
        this.cost = cost;
    }
   public String toString() {
       return "ProductDTO [id=" + id + ", name=" + name + ", vendor=" + vendor + ", cost=" + cost + "]";
    }
}