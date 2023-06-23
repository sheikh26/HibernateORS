<html><head>
		<script type="text/javascript">
function validateForm()
{
var x=document.forms["myForm"]["rollNo"].value;
if (x==null || x=="")
  {
  alert("Enter valid number?");
  return false;
  }
}
</script>
	</head>
	<body>
		<form action="MarksheetCtrl" name="myForm" onsubmit="return validateForm()">
			<center>
				<table>
					<tr>
						<td>
							Enter RollNo
						</td>
						<td>
							<input type="text" name="RollNo">
						</td>
					
						<td>
							<input type="submit" name="operation" value="GetRecords">
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