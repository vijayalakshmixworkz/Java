package com.xworkz.servlet;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.xworkz.formService.FormService;
import com.xworkz.dto.FormDTO;
import com.xworkz.implementation.FormImplement;
//import com.xworkz.implementation.*;

@WebServlet(loadOnStartup = 1, urlPatterns = "/signup")
public class SignUpForm extends HttpServlet {

	public SignUpForm() {
		System.out.println("no arg const");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		String userId = arg0.getParameter("userId");
		String email = arg0.getParameter("email");
		String password = arg0.getParameter("password");
		String confirmPassword= arg0.getParameter("confirmPassword");
		
		FormDTO formDTO=new FormDTO(userId,email,password,confirmPassword);
		
		FormImplement service = new FormImplement();
		boolean isvalid=service.printFormDetails(formDTO);
		if(isvalid)
		{
			System.out.println("Sign-up success");
			arg0.setAttribute("ABC", "ABC");
			arg0.setAttribute("success", "signin completed");
		}
		else
		{
			System.out.println("details are invalid");
			arg0.setAttribute("failure", "signin incomplete");
		}
		RequestDispatcher requestDispatcher=arg0.getRequestDispatcher("/signup.jsp");
		requestDispatcher.forward(arg0, arg1);
		
		
	}
		

		

	
}