package Com.Ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeCtrl extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("operation");
		String type = request.getParameter("type");
		if ("Submit".equalsIgnoreCase(op)) {

			if("searchByName".equalsIgnoreCase(type))
			{
				RequestDispatcher rd = request.getRequestDispatcher("Layout.jsp?body=ByName.jsp");
				rd.forward(request, response);
			}
			
			if("searchByRollNo".equalsIgnoreCase(type))
			{
				RequestDispatcher rd = request.getRequestDispatcher("Layout.jsp?body=ByRollNo.jsp");
				rd.forward(request, response);
			}
			
		}

	
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
