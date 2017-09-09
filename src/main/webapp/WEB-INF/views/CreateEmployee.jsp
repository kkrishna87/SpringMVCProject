<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>

<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Page</title>
</head>
<body>
	<form:form action="createEmployee" commandName="addEmployee" method="post">
		<form:errors path="*" cssClass="errorblock" element="div" />

		<%
			if (request.getAttribute("employeedata") != null) {
		%>	
			Saved Successfully!!	
		
		<%
			}
		%>

		<table>
			<tr>
				<td><spring:message code="Employee.EmpNum.lbl" />:</td>
				<td><form:input path="EmpNum" type="number"/></td>
				<td><form:errors path="EmpNum" /></td>
			</tr>
			<tr>
				<td><spring:message code="Employee.DeptNum.lbl" />:</td>
				<td><form:input path="DeptNum" type="number" /></td>
				<td><form:errors path="DeptNum" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="Employee.DOJ.lbl" />:</td>
				<td><form:input path="DOJ" type="date"/></td>
				<td><form:errors path="DOJ" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="Employee.DOB.lbl" />:</td>
				<td><form:input path="DOB" type="date"/></td>
				<td><form:errors path="DOB" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="Employee.Salary.lbl" />:</td>
				<td><form:input path="Salary" type="number"/></td>
				<td><form:errors path="Salary" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="Employee.EmpSalGrade.lbl" />:</td>
				<td><form:input path="EmpSalGrade" type="number"/></td>
				<td><form:errors path="EmpSalGrade" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><button type="submit">Register</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>