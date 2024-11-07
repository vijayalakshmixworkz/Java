package com.xworkz.companyServelets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.companyDTO.CompanyDTO;
import com.xworkz.companyImpl.CompanyImpl;
import com.xworkz.companyService.CompanyService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/submitProduct")
public class CompanyServlets extends HttpServlet {

	public CompanyServlets() {
		System.out.println("no args const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String CompanyName = req.getParameter("comapnyName");
		String ProductName = req.getParameter("productName");
		String ProductType = req.getParameter("productType");
		String ProductQuantity = req.getParameter("productQuantity");
		String cost = req.getParameter("productCost");

		// Null and format checks for ProductQuantity and ProductCost
		int ref1 = 0;
		double ref2 = 0.0;

		try {
			if (ProductQuantity != null && !ProductQuantity.isEmpty()) {
				ref1 = Integer.valueOf(ProductQuantity);
			} else {
				System.out.println("Product Quantity is missing or invalid.");
			}

			if (cost != null && !cost.isEmpty()) {
				ref2 = Double.valueOf(cost);
			} else {
				System.out.println("Product Cost is missing or invalid.");
			}

		} catch (NumberFormatException e) {
			System.out.println("Error in parsing Product Quantity or Product Cost: " + e.getMessage());
		}

		double totalCost = ref1 * ref2;

		CompanyDTO dto = new CompanyDTO(CompanyName, ProductName, ProductType, ref1, ref2);
		CompanyService service = new CompanyImpl();
		boolean isvalid = service.validate(dto);

		if (isvalid) {
			System.out.println("details are valid");
			req.setAttribute("success", "product details are valid");
			req.setAttribute("ProductName", ProductName);
			req.setAttribute("totalCost", totalCost);
		} else {
			System.out.println("details are invalid");
			req.setAttribute("failure", "product details are invalid");
			req.setAttribute("valid", "validation error");
			//req.setAttribute("value", new CompanyDTO(CompanyName, ProductName, ProductType));
			req.setAttribute("dto", new CompanyDTO(CompanyName, ProductName, ProductType, ref1, ref2));
		}

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Product.jsp");
		requestDispatcher.forward(req, res);
	}
}