
package com.xworkz.FunctionalInterfaces.runner;
import java.util.ArrayList;
import java.util.Collection;
import com.xworkz.FunctionalInterfaces.things.ProductDTO;

public class ProductRunner {  
	public static void main(String[] args) {
	
        Collection<ProductDTO> productDTOs = new ArrayList<ProductDTO>();
        productDTOs.add(new ProductDTO(1, "Product1", "flipkart", 100.0));
        productDTOs.add(new ProductDTO(2, "Product2", "amazon", 123.0));
        productDTOs.add(new ProductDTO(3, "Product3", "myntra", 564.0));
        productDTOs.add(new ProductDTO(4, "Product4", "meesho", 456.0));
        productDTOs.add(new ProductDTO(5, "Product5", "blinkit", 234.0));
        productDTOs.add(new ProductDTO(6, "Product6", "instamart", 788.0));
        productDTOs.add(new ProductDTO(7, "Product7", "zepto", 6789.0));
        productDTOs.add(new ProductDTO(8, "Product8", "zomato", 466.0));
        productDTOs.add(new ProductDTO(9, "Product9", "reliance", 345.0));
        productDTOs.add(new ProductDTO(10, "Product10", "sugar", 600.0));
        public int compareTo(ProductDTO o)
        {
        	return this.name.compareTo(o.name);
        }
		forEach((productDTO)->System.out.println(productDTOs));
        System.out.println("=======================sort==================");
        // comparator
        productDTOs.
        stream().
        sorted().//element:Comparable
        forEach(dto->System.out.println(dto));

    }
}

