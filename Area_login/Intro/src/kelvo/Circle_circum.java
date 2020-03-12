package kelvo;

import java.io.IOException;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/circum")
public class Circle_circum extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		double  circum = 0, area = 0;
		HttpSession session = req.getSession();
		String resultPage = "/Intro/result.html";
		
		if(req.getParameter("circum") != null)
		{
			circum = Double.parseDouble(req.getParameter("circum"));
		}
		else
		{
			circum = 1.0;
		}
		
		
		area = (Math.pow(circum, 2))/ (4 * Math.PI ) ;
		//RequestDispatcher protocol = req.getRequestDispatcher(resultPage);
		//protocol.forward(req, res);
		session.setAttribute("area", area);
		res.sendRedirect(resultPage);
		
		//System.out.println("The area is " + area);

	}
}
