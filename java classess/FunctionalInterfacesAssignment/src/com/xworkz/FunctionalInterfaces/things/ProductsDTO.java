package com.xworkz.FunctionalInterfaces.things;
public class ProductsDTO implements Seriable<ProductsDTO> {
    private int id;
    private String name;
    private String vendor;
    private double cost;

    public ProductsDTO(int id, String name, String vendor, double cost) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public double getCost() {
        return cost;
    }

    public int compareTo(ProductsDTO other) {
        return Double.compare(this.cost, other.cost);
    }

    @Override
    public String toString() {
        return "ProductsDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vendor='" + vendor + '\'' +
                ", cost=" + cost +
                '}';
    }
}