<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
This is my First JSP name is ${name}
 Password is ${password}
<%Date date =new Date(); %>
<%System.out.println("HEllo boss"); %>
<div> current date is <%=date%></div>
<div>you need to understand that JSP is view ideally you should not use scriplets and put is login in JSPs you should always just display 
information thats it.
</div>
<form action="/spring-mvc/login.do" method="post">
Enter your name<input type ="text" name="name">
password<input type ="password" name="password">
<input type="submit" name="Submit" value="Submit">
</form>
</body>
</html>