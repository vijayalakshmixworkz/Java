package com.xworkz.FunctionalInterfaces.runner;
import java.util.List;

public class ProductsRunner {
    public static void main(String[] args) {
        Collection<ProductsDTO> products = new ArrayList<>();
        
        products.add(new ProductsDTO(1, " A", "Vendor X", 6000));
        products.add(new ProductsDTO(2, " B", "Vendor Y", 15000));
        products.add(new ProductsDTO(3, " C", "Vendor Z", 30000));
        products.add(new ProductsDTO(4, " D", "Vendor A", 500));
        products.add(new ProductsDTO(5, " E", "Vendor B", 10000));
        products.add(new ProductsDTO(6, " F", "Vendor C", 20000));
        products.add(new ProductsDTO(7, "Product G", "Vendor D", 4000));
        products.add(new ProductsDTO(8, "Product H", "Vendor A", 25000));
        products.add(new ProductsDTO(9, "Product I", "Vendor E", 8000));
        products.add(new ProductsDTO(10, "Product J", "Vendor F", 12000));

        List<ProductsDTO> productsGreaterThan5000 = products.stream()
                .filter(p -> p.getCost() > 5000)
                .collect(Collectors.toList());

        List<ProductsDTO> productsInRange = products.stream()
                .filter(p -> p.getCost() > 5000 && p.getCost() < 30000)
                .collect(Collectors.toList());

        List<ProductsDTO> productsSortedByCostDesc = products.stream()
                .sorted(Comparator.comparing(ProductsDTO::getCost).reversed())
                .collect(Collectors.toList());

        List<ProductsDTO> productsVendorA = products.stream()
                .filter(p -> p.getVendor().startsWith("A"))
                .sorted(Comparator.comparing(ProductsDTO::getName))
                .collect(Collectors.toList());

        List<ProductsDTO> productsSortedByCostAndId = products.stream()
                .sorted(Comparator.comparing(ProductsDTO::getCost)
                        .thenComparing(ProductsDTO::getId))
                .collect(Collectors.toList());

        List<String> productNames = products.stream()
                .map(ProductsDTO::getName)
                .collect(Collectors.toList());

        List<Integer> productIds = products.stream()
                .map(ProductsDTO::getId)
                .collect(Collectors.toList());

        List<ProductsDTO> productsWithUppercaseNames = products.stream()
                .map(p -> new ProductsDTO(p.getId(), p.getName().toUpperCase(), p.getVendor(), p.getCost()))
                .collect(Collectors.toList());

        System.out.println("Products cost greater than 5000: " + productsGreaterThan5000);
        System.out.println("Products cost between 5000 and 30000: " + productsInRange);
        System.out.println("Products sorted by cost (desc): " + productsSortedByCostDesc);
        System.out.println("Products from vendors starting with 'A' sorted by name: " + productsVendorA);
        System.out.println("Products sorted by cost and id: " + productsSortedByCostAndId);
        System.out.println("Product names: " + productNames);
        System.out.println("Product ids: " + productIds);
        System.out.println("Products with uppercase names: " + productsWithUppercaseNames);
    }
}