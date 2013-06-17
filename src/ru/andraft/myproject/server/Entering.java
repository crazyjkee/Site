	package ru.andraft.myproject.server;

	import java.io.IOException;

	import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.client.Cookies;

	public class Entering extends HttpServlet {
		public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
			UserService userService = UserServiceFactory.getUserService();

	        String thisURL = request.getRequestURI();

	        response.setContentType("text/html");
	        if (request.getUserPrincipal() != null) {
	            response.getWriter().println("<p>Hello, " +
	                                     request.getUserPrincipal().getName() +
	                                     "!  You can <a href=\"" +
	                                     userService.createLogoutURL(thisURL) +
	                                     "\">sign out</a>.</p>");
	            Cookies.setCookie("auth", request.getUserPrincipal().getName());
	        } else {
	            response.getWriter().println("<p>Please <a href=\"" +
	                                     userService.createLoginURL(thisURL) +
	                                     "\">sign in</a>.</p>");
	        }
	    }

	}