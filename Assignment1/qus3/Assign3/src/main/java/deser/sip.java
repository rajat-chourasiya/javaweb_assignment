package deser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class sip extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("user_name");
		String passwd=req.getParameter("password");
		if(passwd.equals("Servlet")) {
			RequestDispatcher rd=req.getRequestDispatcher("nextS");
			rd.forward(req, res);
			
		}
		else {
			out.print("Incorrect password");
			RequestDispatcher rd=req.getRequestDispatcher("sq3.html");
			rd.include(req, res);
		}

		
		
	
}
}
