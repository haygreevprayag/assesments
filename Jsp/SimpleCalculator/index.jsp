<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="cal.jsp" method="post">
		<table border="1">
			<thead>
				<tr>
					<th colspan="2">Calculator</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Number 1</td>
					<td><input type="text" name="no1" id="no1" /></td>
				</tr>
				<tr>
					<td>Number 2</td>
					<td><input type="text" name="no2" id="no2" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="submit" name="submit"/></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
