<%@page import="model.EmployeeModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee List</h1>
	<%
	List<EmployeeModel> employees = (List<EmployeeModel>) request.getAttribute("employees");
	%>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Experience</th>
			<th>Seniority</th>
			<th>Salary</th>
			<th>Deptid</th>
			
		</tr>
		<%
		for (EmployeeModel e : employees) {
			request.setAttribute("e", e);
		%>
		<tr>
			<td>${e.id}</td>
			<td>${e.name}</td>
			<td>${e.age}</td>
			<td>${e.experience} </td>
			<td>${e.seniority}</td>
			<td>${e.salary}</td>
			<td>${e.deptId}
			<td>
			<a  href="delete?id=${o.id}">Delete</a>
			<a  href="edit?id=${o.id}">Edit</a>
			
			
			</td>
		</tr>
 
		<%
		}
		%>
 <tfoot>
 <tr>
 <td colspan="5" align="right">
 <form action="new" method="get">
 <input type="submit" name="submit" value="New Order"/>
 
 </form>
 </td>
 
	</table>
</body>
</html>


