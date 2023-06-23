
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="Com.DTO.MarksheetDTO"%>
<%@page import="java.util.List"%><html>
	<body>
		<form>
			<center>
				<table border="">
					<tr>
						<td>
							Name
						</td>
						<td>
							RollNo
						</td>

						<td>
							Maths
						</td>

						<td>
							Physics
						</td>

						<td>
							Chemistry
						</td>
					</tr>
					<%
						List list = (List) request.getAttribute("getList");
						Iterator it = list.iterator();
						while (it.hasNext()) {
							MarksheetDTO marksheetDTO = (MarksheetDTO) it.next();
					%>
					<tr>
						<td>
							<%=marksheetDTO.getName()%>
						</td>

						<td>
							<%=marksheetDTO.getRollNo()%>
						</td>
						<td>
							<%=marksheetDTO.getMaths()%>
						</td>
						<td>
							<%=marksheetDTO.getPhy()%>
						</td>

						<td>
							<%=marksheetDTO.getChe()%>
						</td>
					</tr>
					<%
						}
					%>

				</table>
			</center>
		</form>
		<a href="javascript:history.back()">Back</a>
	</body>
</html>