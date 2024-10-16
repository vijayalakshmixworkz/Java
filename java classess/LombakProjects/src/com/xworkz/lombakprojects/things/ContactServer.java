package com.xworkz.lombakprojects.things;

@WebServlet(loadOnStartup = 1, urlPatterns = "/contact")
public class ContactServer extends HttpServlet{
	
	public ContactServer()
	{
		System.out.println("Created ContactServer....");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException
	{
		System.out.println("Running service in ContactServer");
		
		String name= req.getParameter("name");
		String email=req.getParameter("email");
		String mobnumber=req.getParameter("mobnumber");
		String age=req.getParameter("age");
		String address=req.getParameter("address");
		
		
		
		
		System.out.println(" name :" +name);
		System.out.println("email :" +email);
		System.out.println("mobnumber :" +mobnumber);
		System.out.println("age :" +age);
		System.out.println("address :" +address);
		
		
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("Contact is Success ");
		
	}


	

	

}