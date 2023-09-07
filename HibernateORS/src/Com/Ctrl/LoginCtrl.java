package Com.Ctrl;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Com.DTO.LoginDTO;
import Com.Service.LoginService;

public class LoginCtrl extends HttpServlet {
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String UserName = request.getParameter("user");
		String Password = request.getParameter("password");
		String op = request.getParameter("operation");
		HttpSession session = request.getSession(true);

		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserName(UserName);
		loginDTO.setPassword(Password);
		LoginService ls = new LoginService();

		if ("login".equalsIgnoreCase(op)) {
			loginDTO = ls.authenticate(loginDTO);

			if (loginDTO != null) {
				session.setAttribute("user", UserName);
				System.out.println("Password is valid");
				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=Marksheet.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("message","Invalid username or password.");
				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=Login.jsp");

				rd.forward(request, response);
			}
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
