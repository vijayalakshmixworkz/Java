package com.xworkz.JobApplications.servlet;

public class JobServlet extends HttpServlet{
public JobServlet()
{
	
}
@Override
protected void service(HttpSevletRequest req,HttpSevletResponse res)
System.out.println("running service in JonServlet");
String name=req.getParameter("name");
//print it or debug mode


}
