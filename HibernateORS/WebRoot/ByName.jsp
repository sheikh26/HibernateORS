
<%@page import="Com.DTO.MarksheetDTO"%><html>

	<head>

		<script type="text/javascript">
function validateForm()
{
var x=document.forms["myForm"]["name"].value;
if (x==null || x=="")
  {
  alert("Enter valid name ?");
  return false;
  }
}
</script>
	</head>
	<body>


		<form action="MarksheetCtrl" name="myForm"
			onsubmit="return validateForm()">
			<center>
				<table>
					<tr>
						<td>
							Enter Name
						</td>
						<td>
							<input type="text" name="name">
						</td>

						<td>
							<input type="submit" name="operation" value="Search">
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