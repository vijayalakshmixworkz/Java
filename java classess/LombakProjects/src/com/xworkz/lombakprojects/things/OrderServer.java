package com.xworkz.lombakprojects.things;

@WebServlet(loadOnStartup = 1, urlPatterns = "/order")

public class OrderServer extends HttpServlet {

	public OrderServer() {
		System.out.println("Created OrderServer....");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service in OrderServer");

		String customername = req.getParameter("customername");
		String items = req.getParameter("items");
		String quantity = req.getParameter("quantity");

		System.out.println("customer name :" + customername);
		System.out.println("item :" + items);
		System.out.println("quantity :" + quantity);

		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Order is Success for item with Quantity");

	}

}
