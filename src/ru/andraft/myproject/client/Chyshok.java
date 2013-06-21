package ru.andraft.myproject.client;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.core.client.EntryPoint;

import com.google.gwt.user.client.Window;
public class Chyshok implements EntryPoint {
	Label label = new Label(""+Window.getClientWidth());
	final static RootPanel enter = RootPanel.get("enter");
	final static RootPanel log = RootPanel.get("enter");
	
	public void onModuleLoad() {
		RootPanel.get("header").add(new Header());

	
	  }
	}	