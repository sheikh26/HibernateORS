package Com.Ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.DTO.MarksheetDTO;
import Com.Service.MarksheetService;

public class MarksheetCtrl extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("operation");
		try {

			MarksheetDTO marksheetDTO = new MarksheetDTO();
			MarksheetService marksheetService = new MarksheetService();

			if ("Add".equalsIgnoreCase(op)) {
				int RollNo = Integer.parseInt(request.getParameter("RollNo"));
				String Name = request.getParameter("Name");
				int phy = Integer.parseInt(request.getParameter("phy"));
				int che = Integer.parseInt(request.getParameter("che"));
				int maths = Integer.parseInt(request.getParameter("maths"));

				marksheetDTO.setRollNo(RollNo);
				marksheetDTO.setName(Name);
				marksheetDTO.setPhy(phy);
				marksheetDTO.setChe(che);
				marksheetDTO.setMaths(maths);

				System.out.println("This is Add operation");
				marksheetService.add(marksheetDTO);
				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=Marksheet.jsp");
				rd.forward(request, response);
			}

			if ("Delete".equalsIgnoreCase(op)) {
				int RollNo = Integer.parseInt(request.getParameter("RollNo"));
				marksheetDTO.setRollNo(RollNo);

				marksheetService.delete(marksheetDTO);
				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=Marksheet.jsp");
				rd.forward(request, response);
			}

			if ("update".equalsIgnoreCase(op)) {
				int RollNo = Integer.parseInt(request.getParameter("RollNo"));
				String Name = request.getParameter("Name");
				int phy = Integer.parseInt(request.getParameter("phy"));
				int che = Integer.parseInt(request.getParameter("che"));
				int maths = Integer.parseInt(request.getParameter("maths"));

				marksheetDTO.setRollNo(RollNo);
				marksheetDTO.setName(Name);
				marksheetDTO.setPhy(phy);
				marksheetDTO.setChe(che);
				marksheetDTO.setMaths(maths);

				marksheetService.update(marksheetDTO);
				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=Marksheet.jsp");
				rd.forward(request, response);
			}
			if ("Search".equalsIgnoreCase(op)) {
				String Name = request.getParameter("name");
				marksheetDTO.setName(Name);
				List list = marksheetService.Get1(marksheetDTO);
				System.out.println("list size in action " + list.size());
				request.setAttribute("getList", list);

				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=MarksheetList.jsp");
				rd.forward(request, response);
				/*
				 * } else { RequestDispatcher rd = request
				 * .getRequestDispatcher("Layout.jsp?body=ByName.jsp");
				 * rd.forward(request, response); }
				 */

			}

			if ("GetRecords".equalsIgnoreCase(op)) {
				int RollNo = Integer.parseInt(request.getParameter("RollNo"));
				marksheetDTO.setRollNo(RollNo);

				marksheetDTO = marksheetService.Get(marksheetDTO);
				request.setAttribute("Get", marksheetDTO);
				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=DisplayRecored.jsp");
				rd.forward(request, response);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		if ("Logout".equalsIgnoreCase(op)) {
			RequestDispatcher rd = request
					.getRequestDispatcher("Layout.jsp?body=Login.jsp");
			rd.forward(request, response);
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}
/*
 * <script type="text/javascript"> function validateForm() { var
 * x=document.forms["myForm"]["name"].value; if (x==null || x=="") { alert("pl'z
 * insert record ?"); return false; } } </script>
 */

/*
 * if("GetRecords".equalsIgnoreCase(op)) { MarksheetService marksheetservice =
 * new MarksheetService(); List list = marksheetservice.getList();
 * request.setAttribute("getList", list); RequestDispatcher rd = request
 * .getRequestDispatcher("Layout.jsp?body=MarksheetList.jsp");
 * rd.forward(request, response); }
 */
/*
 * * if ("Search(Name)".equalsIgnoreCase(op)) { String Name =
 * request.getPaparameter("Name"); MarksheetDTO marksheetDTO=new MarksheetDTO();
 * marksheetDTO.setName(Name);
 * 
 * MarksheetService marksheetService=new MarksheetService(); marksheetDTO =
 * marksheetService.searchByName(marksheetDTO);
 * 
 * request.setAttribute("Get", marksheetDTO);
 * 
 * RequestDispatcher rd = request
 * .getRequestDispatcher("Layout.jsp?body=DisplayRecored.jsp");
 * rd.forward(request, response); }
 */
