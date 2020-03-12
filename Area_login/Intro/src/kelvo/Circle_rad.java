package kelvo;

import java.io.IOException;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/rad")
public class Circle_rad extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		double radius = 0, area = 0;
		HttpSession session = req.getSession();
		String resultPage = "/Intro/result.html";
		
		if(req.getParameter("radius") != null)
		{
			radius = Double.parseDouble(req.getParameter("radius"));
		}
		else
		{
			radius = 1.0;
		}
		
		area = Math.PI * (Math.pow(radius, 2));
		//RequestDispatcher protocol = req.getRequestDispatcher(resultPage);
		session.setAttribute("area", area);
		//res.sendRedirect(location);
		//protocol.forward(req, res);
		//System.out.println("Area = " + area);
		
		//Session route
		session.setAttribute("area", area); //sending the area variable into the session interface
		res.sendRedirect(resultPage);
		
		
	}

}
