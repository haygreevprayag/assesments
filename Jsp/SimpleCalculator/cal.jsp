<%

int no1=Integer.parseInt(request.getParameter("no1"));
int no2=Integer.parseInt(request.getParameter("no2"));

int add=no1+no2;
int sub=no1-no2;
int mul=no1*no2;
int div=no1/no2;


out.println("Addition\n");
out.println(String.valueOf(add));
out.println("Subtraction\n");
out.println(String.valueOf(sub));
out.println("Multiplication\n");
out.println(String.valueOf(mul));
out.println("Division\n");
out.println(String.valueOf(div));

%>
