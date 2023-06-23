
<%@page import="Com.DTO.MarksheetDTO"%><html>
	<body>
	<%
	MarksheetDTO marksheetDTO = (MarksheetDTO)request.getAttribute("Get");
		if (marksheetDTO == null) {
						marksheetDTO = new MarksheetDTO();
					}
	
	 %>
	 Hi, <%=session.getAttribute("user")%> your Wel-come in OnlineResultSystem
	
		<form action="MarksheetCtrl"  method="get"
		onsubmit="return validate (this)">
		<center>
			<table>
				<tr>
					<td>
						RollNo
					</td>
					<td>
						<input type="text" name="RollNo" value="<%=marksheetDTO.getRollNo() %>" readonly="readonly">
					</td>
				</tr>
				<tr>
					<td>
						Name
					</td>
					<td>
						<input type="text" name="Name"  value="<%=marksheetDTO.getName() %>" readonly="readonly">
					</td>
				</tr>
				<tr>
					<td>
						Physics
					</td>
					<td>
						<input type="text" name="phy"  value="<%=marksheetDTO.getPhy() %>" readonly="readonly">
					</td>
				</tr>
				<tr>
					<td>
						Chemistry
					</td>
					<td>
						<input type="text" name="che"  value="<%=marksheetDTO.getChe() %>" readonly="readonly">
					</td>
				</tr>
				<tr>
					<td>
						Maths
					</td>
					<td>
						<input type="text" name="maths"  value="<%=marksheetDTO.getMaths()%>" readonly="readonly">
					</td>
				</tr>
				<tr>
				<td>
				<a href="javascript:history.back()">Back</a>
				</td>
				</tr>
			</table>
			</center>
		</form>
	</body>
</html>