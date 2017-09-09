<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>

<%=request.getAttribute("employee") %>
	${requestScope.employee}
	EmpNum: ${employee.EmpNum}
	<br> DeptNum: ${employee.DeptNum}
	<br> DOJ: ${employee.DOJ}
	<br> DOB: ${employee.DOB}
	<br> Salary: ${employee.Salary}
	<br>EmpSalGrade:${employee.EmpSalGrade}

</body>
</html>