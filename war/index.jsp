<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.google.appengine.api.users.UserService,com.google.appengine.api.users.UserServiceFactory" %>
 <%String enter="no";
  String exit="no";
  String userName="no";
  UserService userService = UserServiceFactory.getUserService();
  if (request.getUserPrincipal() != null) { 
	  userName=request.getUserPrincipal().getName();
      exit =userService.createLogoutURL("/");
} else 
        enter=userService.createLoginURL("/");
%>
<!doctype html>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

                             
    <link type="text/css" rel="stylesheet" href="Chyshok.css">

    
    <title>Web Application Starter Project</title>
    
                               
    <script type="text/javascript" language="javascript" src="chyshok/chyshok.nocache.js"></script>
  </head>
  <body>
  <div id="enter"><%=userName+" "+exit+" "+enter %></div>
<div id="header"></div>
<div id="log"></div>
<div id="test"></div>
    
    
  </body>
</html>