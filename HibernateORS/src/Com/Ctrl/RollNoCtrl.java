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

public class RollNoCtrl extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op=request.getPaparameter("operation");
		try{
			int RollNo= Integer.parseInt(request.getPaparameter("RollNO"));
			MarksheetDTO marksheetDTO=new MarksheetDTO();
			marksheetDTO.setRollNo(RollNo);
			MarksheetService marksheetService=new MarksheetService();
			if("Search".equalsIgnoreCase(op)){
				if (marksheetDTO != null) {
					request.setAttribute("get", marksheetDTO);

					RequestDispatcher rd = request
							.getRequestDispatcher("Layout.jsp?body=DisplayRecored.jsp");
					rd.forward(request, response);

				}
				else
					{

				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=ByRollNo.jsp");
				rd.forward(request, response);
			}
		} 
		}
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			}
			
			
		
		
		
		
		
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
