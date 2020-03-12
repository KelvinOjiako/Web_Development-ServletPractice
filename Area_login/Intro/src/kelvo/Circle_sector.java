package kelvo;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sector")
public class Circle_sector extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		double sector_area = Double.parseDouble(req.getParameter("a_sector"));
		double angle = Double.parseDouble(req.getParameter("angle")), area =0;
		
		area = (sector_area * 360)/ angle;
		HttpSession session = req.getSession();
		session.setAttribute("area", area);
		res.sendRedirect("/Intro/result.html");
		//System.out.print("the area is " + area);
		
		
	}

}
