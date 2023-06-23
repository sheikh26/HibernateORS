<html>
	<head>
		<script type="text/javascript">
	function validate form()
	var x=document.forms[myform]["user"].value
	if (x==null || x=="")
  {
  alert("User name can not be null");
  return false;
  }
  
  var y=document.forms["myForm"]["password"].value;
if (y==null || y=="")
  {
  alert("Password can not be null");
  return false;
  }
}
	
	</script>
	</head>
	<body>
		<br>
		<form action="LoginCtrl" name="myform" method="get"
			onsubmit="return validateform()">
			<center>
				<center>

				<table>

					<tr>
						<td>
							UserName
						</td>
						<td>
							<input type="text" name="user">
						</td>
					</tr>
					<tr>
						<td>
							Password
						</td>
						<td>
							<input type="password" name="password">
						</td>
					</tr>
					<tr>
						<td>
							<input type="submit" name="operation" value="Login">
						</td>
				
						<td>
							<a href="javascript:history.back()">Back</a>
						</td>
					</tr>
				</table>
				</center>
		</form>
	</body>