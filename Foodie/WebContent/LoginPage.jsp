<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="icsd.DBHandler"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
<%
String strunm=request.getParameter("txtunm");
String strpwd=request.getParameter("txtpwd");
DBHandler objDh=new DBHandler();
Connection con=objDh.getDBcon();
try
{
PreparedStatement stmt=con.prepareStatement("select * from sac1 where unm =? and pwd=?");
stmt.setString(1, strunm);
stmt.setString(2, strpwd);
ResultSet rset=stmt.executeQuery();

if(rset.next())
	
{
	System.out.println("sac11111111111111111111111111 login page unm= "+strunm+" "+strpwd);
     session.setAttribute("unm", strunm);
     
	response.sendRedirect(request.getContextPath()+"/HomePage.jsp");
}

con.close();

}
catch(SQLException se)
{
	se.printStackTrace();
}
  %>
<form action="LoginPage.jsp" method="post">
		userName: <input type="text" name="txtunm" /><br> 
		password:<input type="password" name="txtpwd" /><br> 
		 <input type="submit" value="login"/><br> 
	</form>

</body>
</html>