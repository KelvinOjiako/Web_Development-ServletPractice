package kelvo;

import java.io.IOException;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/diam")
public class Circle_diameter extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		double radius = 0, diameter = 0, area = 0;
		HttpSession session = req.getSession();
		String resultPage = "/Intro/result.html";
		
		if(req.getParameter("diameter") != null)
		{
			diameter = Double.parseDouble(req.getParameter("diameter"));
		}
		radius = diameter /2;
		
		area = Math.PI * (Math.pow(radius, 2));
		//RequestDispatcher protocol = req.getRequestDispatcher(resultPage);
		session.setAttribute("area", area);
		
		//System.out.println("The area is " + area);
		res.sendRedirect(resultPage);

	}
}

