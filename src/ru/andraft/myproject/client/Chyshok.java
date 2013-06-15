package ru.andraft.myproject.client;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;


public class Chyshok implements EntryPoint {	
	public void onModuleLoad() {
		Label label = new Label(""+Window.getClientWidth());
		RootPanel log = RootPanel.get("log");
		log.add(label);
		RootPanel header = RootPanel.get("header");
		header.add(new Header());
		
	}
}
