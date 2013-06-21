package ru.andraft.myproject.client;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.core.client.EntryPoint;

import com.google.gwt.user.client.Window;
public class Chyshok implements EntryPoint {
	
	final static RootPanel enter = RootPanel.get("enter");
	final static RootPanel log = RootPanel.get("enter");
	final static RootPanel test = RootPanel.get("test");
	Label label = new Label("lll");
	public void onModuleLoad() {
	RootPanel.get("header").add(new Header());
		//log.add(new Menu(),20,60);
		test.add(new Menushka());
		log.add(label);
		

	
	  }
	}	