package com.xworkz.lombakprojects.things;

@WebServlet(loadOnStartup = 1, urlPatterns = "/search")
public class SearchServer extends HttpServlet {

	public SearchServer() {
		System.out.println("Created SearchServer....");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service in SearchServer");

		String email = req.getParameter("email");
		System.out.println("email :" + email);

		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Search is Success for email");

	}

}
