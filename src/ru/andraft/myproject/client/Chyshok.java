package ru.andraft.myproject.client;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
public class Chyshok implements EntryPoint {
	
	final static RootPanel enter = RootPanel.get("enter");
	final static RootPanel lalka = RootPanel.get("lalka");
	final static RootPanel test = RootPanel.get("test");
	public static Label label = new Label("lll");
	Menushka m = new Menushka();
	public void onModuleLoad() {
	RootPanel.get("header").add(new Header());
		//log.add(new Menu(),20,60);
		test.add(new Menushka());
		test.add(label);
		    // Add it to the root panel.
		

	
	}
	}	