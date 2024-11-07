package com.xworkz.companyImpl;
import com.xworkz.companyDTO.CompanyDTO;
import com.xworkz.companyService.CompanyService;
public class CompanyImpl implements CompanyService {
	@Override
	public boolean validate(CompanyDTO company) {
		// TODO Auto-generated method stub
	boolean valid=true;
	String companyName=company.getCompanyName();
	if (companyName != null && !companyName.isEmpty() && companyName.length() >= 3 && companyName.length() <= 100) {
		System.out.println("companyName is  valid");
		valid = true;
	} else {
		System.out.println("companyName is  not valid");
		valid=false;
	}
	System.out.println("================");
	
	
	String productName=company.getProductName();
	if (productName != null && !productName.isEmpty() && productName.length() >= 3 && productName.length() <= 100) {
		System.out.println("productName is  valid");
		valid = true;
	} else {
		System.out.println("productName is  not valid");
		valid=false;
	}
	System.out.println("================");
	
	
	
	 int productQuantity=company.getProductQuantity();
	 if (productQuantity >1 &&productQuantity < 9) { 
			 System.out.println("productQuantity is  valid");
			valid = true;
		} 
	else 
		{
			System.out.println("productQuantity is  not valid");
			valid=false;
		}
		System.out.println("================");
		
	 double productCost=company.getProductCost();
	 if (productCost < 100) {
		 System.out.println("productCost is  valid");
		valid = true;
	} else {
		System.out.println("productCost is  not valid");
		valid=false;
	} 
	return valid;
}

	
}



