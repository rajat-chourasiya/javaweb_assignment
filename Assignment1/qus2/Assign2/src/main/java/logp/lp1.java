package logp;

import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class lp1 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("user_name");
		String passwd=req.getParameter("user_pname");
		if(name.equals("akash") && passwd.equals("3375")) {
			
			out.println("<h2>HELLO AKASH</h2>");
		}
		else {
			out.println("<h2>LOGIN FAILED</h2>");
			
		}

		
		
		
		
		
	}
	
   
}
