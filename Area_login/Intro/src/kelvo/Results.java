package kelvo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/result.html")
public class Results extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession session = req.getSession();
		
		double area = 0;
		area = (double)session.getAttribute("area");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html><head>");
		out.print("<title> Area Results Page </title></head>");
		out.print("<body> The Area of the shape is " + area + "<br><br>");
		//System.out.println("yup! the area is " + area);
		out.print("<a href ='WebPages/welcome.html'> Home :) </a> ");
		

	}

}
