<%
	String uname = request.getParameter("uname");
	String password = request.getParameter("pass");
	
	if(uname.equals("Prayag")&& password.equals("12345")){
		out.println("Login Success");
	}
	
	else{
		out.println("Login Fail");
	}

%>
