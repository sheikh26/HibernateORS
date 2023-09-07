<html>
<head>
</head>


	<body>

		<table  width="100%" >
			<tr>
				<td>
					<jsp:include page="Header.jsp" />
				</td>
			</tr>


		</table>


		<table  height="70%" width="100%" >
			<tr>
				<td>
					<jsp:include page="Menu.jsp" />
				</td>
				<%
					String body = request.getParameter("body");
				%>
				<td>
					<jsp:include page="<%=body%>" />
				</td>
			</tr>


		</table>
		

		<table  height="15%" width="100%">
			<tr>
				<td>
					<jsp:include page="Footer.jsp" />
				</td>
			</tr>
		</table>
	</body>
</html>