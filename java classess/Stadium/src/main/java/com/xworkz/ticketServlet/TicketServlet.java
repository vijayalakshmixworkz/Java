package com.xworkz.ticketServlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.TicketDTO.TicketDTO;
import com.xworkz.ticketImpl.TicketImpl;
import com.xworkz.ticketService.TicketService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/submitProduct")
public class TicketServlet extends HttpServlet{
	public TicketServlet() {
		System.out.println("no args const");
	}
	
@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, res);
		String stadiumName = req.getParameter("stadiumName");
		String email = req.getParameter("email");
		String ticket= req.getParameter("ticket");
		String primaryContact = req.getParameter("primaryContact");
		int ref1=Integer.parseInt(ticket);
		long ref2=Long.parseLong(primaryContact);
		TicketDTO dto = new TicketDTO(stadiumName, ref1, ref2,email);
		TicketService service = new TicketImpl();
		boolean isvalid = service.validate(dto);

		if (isvalid) {
			System.out.println("details are valid");
			req.setAttribute("success", "ticket booked");
			req.setAttribute("stadiumName", stadiumName);
			req.setAttribute("ticket", ticket);
		} else {
			System.out.println("details are invalid");
			req.setAttribute("failure", "could not book");
			req.setAttribute("valid", "validation error");
			req.setAttribute("dto", new TicketDTO(stadiumName, ref1, ref2,email));
		}

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Product.jsp");
		requestDispatcher.forward(req, res);
	}
}