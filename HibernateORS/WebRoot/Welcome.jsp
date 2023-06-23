<html>
	<head>
		<title></title>
	</head>
	<body>
	
<font size=32 color="pink">	Your Wel-come in Online result services</font>
<br>
		<a href="Layout.jsp?body=Login.jsp">Administrator</a><br>
         <u><b>To get Result select any one</b></u>
		<form action="WelcomeCtrl">

			<table align="left">
				
				<tr>
				
					<td style="color: red;">
						Search By Name
					</td>
					<td>
						<input type="radio" name="type" value="searchByName">
					<td>
				</tr>
				<tr>
					<td>
						Search By RollNo
					</td>
					<td>
						<input type="radio" name="type" value="searchByRollNo">
					</td>
				<tr>
				<tr>
					<td>
						<input type="submit" name="operation" value="Submit">
					</td>
				</tr>
			</table>

		</form>
	</body>
</html>