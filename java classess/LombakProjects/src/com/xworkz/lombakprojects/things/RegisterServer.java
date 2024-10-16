package com.xworkz.lombakprojects.things;

@WebServlet(loadOnStartup = 1, urlPatterns = "/register")
public class RegisterServer extends HttpServlet {

	public RegisterServer() {
		System.out.println("Created RegisterServer....");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service in RegisterServer");

		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String email = req.getParameter("email");
		String mobnumber = req.getParameter("mobnumber");
		String secret = req.getParameter("secret");
		String gender = req.getParameter("gender");
		String confirmpassword = req.getParameter("confirmpassword");
		String countries = req.getParameter("countries");
		String states = req.getParameter("states");
		String city = req.getParameter("city");

		System.out.println("firstname :" + firstname);
		System.out.println("lastname :" + lastname);
		System.out.println("email :" + email);
		System.out.println("mobnumber :" + mobnumber);
		System.out.println("secret :" + secret);
		System.out.println("gender :" + gender);
		System.out.println("confirmpassword  :" + confirmpassword);
		System.out.println("countries :" + countries);
		System.out.println("states :" + states);
		System.out.println("city :" + city);

		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Registered is Successfully");

	}

}