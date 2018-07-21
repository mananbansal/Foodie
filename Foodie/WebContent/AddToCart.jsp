<%@page import="icsd.Cart"%>
<%@page import="java.util.LinkedList"%>
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

 <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
      body {
      font: 400 15px/1.8 Lato, sans-serif;
      color: #777;
  }
    
      .navbar {
      font-family: Montserrat, sans-serif;
      margin-bottom: 0;
      background-color: #2d2d30;
      border: 0;
      font-size: 11px !important;
      letter-spacing: 4px;
      opacity: 0.9;
  }
  .navbar li a, .navbar .navbar-brand { 
      color: #d5d5d5 !important;
  }
  .navbar-nav li a:hover {
      color: #fff !important;
  }
  .navbar-nav li.active a {
      color: #fff !important;
      background-color: #29292c !important;
  }
  .navbar-default .navbar-toggle {
      border-color: transparent;
  }
  .open .dropdown-toggle {
      color: #fff;
      background-color: #555 !important;
  }
  .dropdown-menu li a {
      color: #000 !important;
  }
  .dropdown-menu li a:hover {
      background-color: red !important;
  }
    
    .bg-1{
      background: #2d2d30;
      color: #bdbdbd;
  }
  .bg-1 h3 {color: #fff;}
  .bg-1 p {font-style: italic;}
  .list-group-item:first-child {
      border-top-right-radius: 0;
      border-top-left-radius: 0;
  }
  
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #bdbdbd;
      padding: 5px;
      border-radius:10px; 
    }
    footer p{
    color: #fff;
    font-style: italic;
    }
    img {
	border-radius:10px; 
}
img {
	width: 200px;
	height: 100px;
}
  </style>

</head>
<body>
<%
DBHandler objDh=new DBHandler();
String strProdid=request.getParameter("prodid");
Cart c=objDh.getCartitem(strProdid);
LinkedList<Cart>lst=(LinkedList<Cart>) session.getAttribute("CART");
   
if(lst==null)
{
	lst= new LinkedList();
	session.setAttribute("CART", lst);
}
lst.add(c);

%>
<form action="AddToCart.jsp" method="post">
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#myPage">Foodie-E</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-left">
        <li><a href="HomePage.jsp">HOME</a></li>
         
       
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">MORE
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Merchandise</a></li>
            <li><a href="#">Extras</a></li>
            <li><a href="#">Media</a></li> 
          </ul>
        </li>
        <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
      </ul>
            <ul class="nav navbar-nav navbar-right">
             <li><a href="#myPage"><span class="glyphicon glyphicon-log-in">login</span></a></li>
        <li><a href="#band"><span class="glyphicon glyphicon-user">SignUp</span></a></li>
            
            </ul>
      
    </div>
  </div>
</nav>

<div class="jumbotron">
  <div class="container text-center">
    <h1>Your Cart</h1>      
    <p>Some text that represents "Me"...</p>
  </div>
</div>
  
<div class="container-fluid bg-1 text-center">    
  <h3>Items</h3><br>
 
  
   <%
   int ttlbill=0;
   for(Cart c1:lst)
   {
   %>
	 
	   <div class="row">
  <div class="col-sm-2">
  </div>
    <div class="col-sm-4">
      
      <img src="img/<%=c1.getStrProdimg() %>" class="img-responsive" style="width:80%" alt="Image">
    </div>
    <div class="col-sm-4">
  
  <ul class="list-group">
    <li class="list-group-item">Name:<%=c1.getStrProdName() %></li>
    <li class="list-group-item">Price:<%=c1.getStrProdPrice() %></li>
    <li class="list-group-item">Desc:<%=c1.getStrProdDesc()%></li>
  </ul>
     <%ttlbill=ttlbill+c1.getStrProdPrice();
     %>
    </div>
    <div class="col-sm-2">
    </div>
    </div><br><br>
    
    <%}
    %>
  
     </div>

<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>

</form>
</body>
</html>