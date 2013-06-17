package ru.andraft.myproject.server;

import ru.andraft.myproject.client.GreetingService;
import ru.andraft.myproject.shared.FieldVerifier;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	public String greetServer(String input) throws IllegalArgumentException {
		if(input.contains("вход")){
			UserService userService = UserServiceFactory.getUserService();
			if(userService.getCurrentUser()==null)
				return userService.createLoginURL("/");
			return userService.getCurrentUser().getNickname();
		}else
			return "че нибудь";
		}
	}

