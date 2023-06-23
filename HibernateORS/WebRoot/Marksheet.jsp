
<%@page import="Com.DTO.MarksheetDTO"%><html>
	<head>
		<title>OnlineResultSystem</title>
					
	</head>
	<body>
	<% MarksheetDTO marksheetDTO=new MarksheetDTO(); %>
	Hi, <%=session.getAttribute("user")%> your Wel-com in OnlineResultSystem
		<center>
			<h1>
				OnlineResultSystem
			</h1>
		</center>
		<form action="MarksheetCtrl" method="get"
			onsubmit="return validate (this)">
			<center>
				<table>
					<tr>
						<td>
							RollNo
						</td>
						<td>
							<input type="text" name="RollNo">
						</td>
					</tr>
					<tr>
						<td>
							Name
						</td>
						<td>
							<input type="text" name="Name">
						</td>
					</tr>
					<tr>
						<td>
							Physics
						</td>
						<td>
							<input type="text" name="phy">
						</td>
					</tr>
					<tr>
						<td>
							Chemistry
						</td>
						<td>
							<input type="text" name="che">
						</td>
					</tr>
					<tr>
						<td>
							Maths
						</td>
						<td>
							<input type="text" name="maths">
						</td>
					</tr>
								
					</table>
					<br>
					<input type="submit" name="operation" value="Add">
					<input type="submit" name="operation" value="Update">
					<input type="submit" name="operation" value="Delete">
					<input type="submit" name="operation" value="GetRecords">
					</center>
		       </form>
		       <form action="MarksheetCtrl" name="myForm1" method="get">
		       <center>
		<a href="javascript:history.back()">Back</a>
		
		<input type="submit" name="operation" value="Logout">
		</center></form>
	</body>
</html>