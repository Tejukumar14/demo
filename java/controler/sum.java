package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sum")
public class sum extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	

		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		
		int c=a+b;
		
		resp.getWriter().print("<h1>The Sum of "+a+"and "+b+"is "+c+" ");
		
		req.setAttribute("res", c);
		
	req.getRequestDispatcher("square").forward(req, resp);
		
		
	}
}
