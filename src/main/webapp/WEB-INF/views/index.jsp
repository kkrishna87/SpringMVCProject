<html>
<body>
	<h2>Home Page</h2>
	<form action="createEmployee">
		<table>
			<tr>
				<td><input type="submit" value="Create Employee" /></td>
			</tr>
		</table>
	</form>

	<form action="getEmployee" method="get">
		<table>
			<tr>
			<td><input type="number" name="empNo" required/></td>
				<td><input type="submit" value="Find Employee" /></td>
			</tr>
		</table>
	</form>

	<form action="updateEmployee">
		<table>
			<tr>
				<td><input type="submit" value="Update Employee" /></td>
			</tr>
		</table>
	</form>

	<form action="deleteEmployee">
		<table>
			<tr>
				<td><input type="submit" value="Delete Employee" /></td>
			</tr>
		</table>
	</form>

	<form action="">
		<table>
			<tr>
				<td><input type="submit" value="DisplayAll Employee" /></td>
			</tr>
		</table>
	</form>
	
	<form action="findDepartement" method="get">
		<table>
			<tr>
			<td><input type="number" name="deptNo" required/></td>
				<td><input type="submit" value="Find Department" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
