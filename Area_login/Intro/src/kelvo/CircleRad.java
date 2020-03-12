package kelvo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CircleRad
 */
@WebServlet("/CircleRad")
public class CircleRad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CircleRad() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		double radius = 0, area = 0;
		//HttpSession session = req.getSession();
		String resultPage = "/result.html";
		
		if(req.getParameter("radius") != null)
		{
			radius = Double.parseDouble(req.getParameter("radius"));
		}
		
		area = Math.PI * (Math.pow(radius, 2));
		RequestDispatcher protocol = req.getRequestDispatcher(resultPage);
		req.setAttribute("area", area);
		protocol.forward(req, res);
		System.out.println("The area is " + area);
		
		//Session route
		//session.setAttribute("area", area); //sending the area variable into the session interface
		//res.sendRedirect("result.html");
		
		
	}

}
