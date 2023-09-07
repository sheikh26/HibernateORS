package Com.Ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.DTO.MarksheetDTO;
import Com.Service.MarksheetService;

public class NameCtrl extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  String op=request.getParameter("operation");
	  try{
		  String name=request.getParameter("name");
		  MarksheetDTO marksheetDTO=new MarksheetDTO();
		  marksheetDTO.setName(name);
		  MarksheetService marksheetService=new MarksheetService();
		  if("Search".equalsIgnoreCase("op")){
			  marksheetDTO=marksheetService.Get(marksheetDTO);
			  if(marksheetDTO!=null){

					request.setAttribute("Get", marksheetDTO);

					RequestDispatcher rd = request
							.getRequestDispatcher("Layout.jsp?body=DisplayRecored.jsp");
					rd.forward(request, response);
				}
				else
				{	
					RequestDispatcher rd = request
					.getRequestDispatcher("Layout.jsp?body=ByName.jsp");
			       rd.forward(request, response);
					
				}

			  
		  }
			  
			  
		  
		  
		  
	  
	  }	catch (Exception e) {
			
			e.printStackTrace();
		}

	
	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
