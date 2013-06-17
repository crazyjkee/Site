<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.google.appengine.api.users.UserService,com.google.appengine.api.users.UserServiceFactory" %>
<!doctype html>


<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

                             
    <link type="text/css" rel="stylesheet" href="Chyshok.css">

    
    <title>Web Application Starter Project</title>
    
                               
    <script type="text/javascript" language="javascript" src="chyshok/chyshok.nocache.js"></script>
  </head>

 
  <body>
  <div id="testik">
  <%UserService userService = UserServiceFactory.getUserService();
  if (request.getUserPrincipal() != null) {  
      response.getWriter().println("Hello, "+
              request.getUserPrincipal().getName() +
              " " +
              userService.createLogoutURL(request.getRequestURI()) );
} else {
response.getWriter().println(
              userService.createLoginURL("/"));
}%></div>
<div id="header"></div>
<div id="log"></div>
    
    
  </body>
</html>